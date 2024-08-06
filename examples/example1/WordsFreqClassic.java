package example1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/08/05/15:31
 * @Description:
 */
public class WordsFreqClassic {
    private Set<String> NON_WORDS = new HashSet<>() {
        { add("the") ;add("and");add("of");add("to");add("a");add("i");add("it");add("in");add("or");add("is");add("d");add("s");add("as");add("so");add("but");        }
    };
    public Map wordFreq(String words){
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        Matcher m = Pattern.compile("\\w+").matcher(words);
        // find the next word available by pattern
        while (m.find()){
            // get the word by pattern
            String word = m.group().toLowerCase();
            if (!NON_WORDS.contains(word)){
                if (wordMap.get(word) == null){
                    wordMap.put(word, 1);
                }else {
                    wordMap.put(word, wordMap.get(word) + 1);
                }
            }
        }
        return wordMap;
    }

}
