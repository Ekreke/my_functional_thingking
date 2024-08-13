package examples2;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/08/05/16:18
 * @Description:
 */
public class TheCompanyProcess {
    public String cleanNames(List<String> listOfNames){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < listOfNames.size() ; i++) {
            if (listOfNames.get(i).length()>1){
                result.append(capitalizeString(listOfNames.get(i))).append(",");
            }
        }
        return result.substring(0, result.length()-1).toString();
    }
    public String capitalizeString(String name){
        return name.substring(0,1).toUpperCase()+name.substring(1 , name.length());
    }
}
