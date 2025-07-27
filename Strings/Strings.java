import java.util.*;

public class Strings {
    public static boolean isPalindrome(String str){
        for(int i = 0; i <= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'W'){
                x--;
            }else if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else{
                x++;
            }
        }
        float x2 = x*x;
        float y2 = y*y;
        return (float)Math.sqrt(x2+y2);

    }

    public static void subString(String str, int si, int ei){
        StringBuilder sb = new StringBuilder();
        for(int i = si; i < ei; i++){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

   public static void largestString(String s[]){
        String largest = s[0];
        for(int i = 0; i < s.length; i++){
            if(largest.compareTo(s[i]) < 0){
                largest = s[i];
            }
        }
        System.out.println(largest);
   }
   
   public static void upperCaseString(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
           
            char ch = ' ';
            if(s.charAt(i) == ch && s.charAt(i+1) != ch){
                sb.append(Character.toUpperCase(s.charAt(i)));
                sb.append(Character.toUpperCase(s.charAt(i+1)));
                i++;
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
   }
   public static void main(String[] args) {
        String str1 = "raceear";
        System.out.println(isPalindrome(str1));
        System.out.println("---------------------------------------");
        String str2 = "WNEENESENNN";
        System.out.println(shortestPath(str2));
        System.out.println("---------------------------------------");
        String str3 = "Hello World";
        subString(str3, 0, 6);
        System.out.println("---------------------------------------");
        String s [] = {"mango","apple","banana"}; 
        largestString(s);
        System.out.println("---------------------------------------");
        String s1 = "hello world friends"; 
        upperCaseString(s1);
        System.out.println("---------------------------------------");
    }
}
