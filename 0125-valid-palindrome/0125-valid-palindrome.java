import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
       String str="";
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str+=Character.toLowerCase(ch);
            }
        }
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        String s1=sb.toString();
        return str.equals(s1);
    }  
    }
