import java.util.Arrays;

public class ReverseStringBySpace {
    public static void main(String args[]) {
        String str = "Gokhan Akdugan";

       System.out.println(reverseString(str));
    }

public static String reverseString(String str){
    if (str == null || str.length() < 1){
        throw new IllegalArgumentException();
    }
    
    if (str.length() == 1){
        return str;
    }
    
    String[] strArr = str.split(" ");
    int arrLen = strArr.length;
    StringBuffer buffer = new StringBuffer();
    
    for (int i = arrLen-1 ; i >= 0 ; i--){
        buffer.append(strArr[i]);
        buffer.append(" ");
    }
    return buffer.toString();

    }
}