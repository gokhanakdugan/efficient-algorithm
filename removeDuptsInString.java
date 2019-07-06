import java.util.HashMap;
import java.util.Arrays;

public class RemoveDups {
    public static void main(String args[]) {
        String str = "aaabcdee";
        System.out.println(removeDups(str));
    }
    
public static String removeDups(String str){
    if (str == null){
        throw new NullPointerException();
    }
    if (str.length() <= 1){
        return str;
    }
    
    char[] strArr = str.toCharArray();
    
    int i = 0;
    int j = 1;
    
    while (j < str.length()){
        if (strArr[i] != strArr[j]){
            i++;
            strArr[i] = strArr[j];
        }
          j++;
        }
       return Arrays.copyOf(strArr,2).toString();
    }
}
