package example1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/08/05/15:43
 * @Description:
 */
public class WordsFreqStream {
    private Set<String> NON_WORDS = new HashSet<>() {
        { add("the") ;add("and");add("of");add("to");add("a");add("i");add("it");add("in");add("or");add("is");add("d");add("s");add("as");add("so");add("but");        }
    };
    private List<String> regexToList(String words , String regex){
        List wordList = new ArrayList<>();
        Matcher matcher = Pattern.compile(regex).matcher(words);
        while (matcher.find()){
            wordList.add(matcher.group());
        }
        return wordList;
    }
    public Map wordFreq(String words){
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        regexToList(words, "\\w+").stream().map(w -> w.toLowerCase(Locale.ROOT))
                .filter(w -> !NON_WORDS.contains(w)).forEach(w -> wordMap.put(w , wordMap.getOrDefault(w, 0)+ 1) );
        return wordMap;
    }
}
