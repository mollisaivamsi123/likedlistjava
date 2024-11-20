// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static String hashMove(String str){
        String sub="";
        StringBuffer st = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '#'){
                sub+="#";
            }
            else{
                st.append(str.charAt(i));
            }
        }
        return sub+st.toString();
    }
    public static boolean palindrome(String arg){
        int left = 0;
        int right = arg.length()-1;
        while(left < right){
            if(arg.charAt(left) != arg.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String asciiToString(int ascii){
        return String.valueOf((char)ascii);
    }
    public static int StringToAscii(String str){
        return (int)(str.charAt(0));
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String test = "abca";
        System.out.println(hashMove(test));
        System.out.println(palindrome(test));
        System.out.println(asciiToString(100));
        System.out.println(StringToAscii("d"));
    }
}
