import java.util.Arrays;

public class StringToInteger {
    public static void main(String args[]) {
        String str = "+1233352353253253253255";
        System.out.println(atoi(str));
    }

public static int atoi(String str){
    if (str == null || str.length() < 1){
        throw new IllegalArgumentException();
    }
    
    String newStr = str.trim();
    System.out.println(newStr);
    boolean flag = true;
    int i = 0;
    
    if (newStr.charAt(0) == '-'){
        flag = false;
        i++;
    }
    else if (newStr.charAt(0) == '+'){
        i++;
    }
    
    double result = 0;
    
    while (newStr.length() > i && newStr.charAt(i) >= '0' && newStr.charAt(i) <= '9'){
        result = result * 10 + (newStr.charAt(i)-'0');
        i++;
    }
    
    if (!flag){
        result = -result;
    }
    
    if (result > Integer.MAX_VALUE){
        throw new IllegalArgumentException("Not in integer bound!");
    }
    
    if (result < Integer.MIN_VALUE){
        throw new IllegalArgumentException("Not in integer bound!");
    }    
    return (int)result;  
    }
}
