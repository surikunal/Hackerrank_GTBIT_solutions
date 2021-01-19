import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = scn.nextInt();
        String ans = func1(str);
        System.out.println(ans.charAt(i));
        func2(str, 0, "");
    }
    
    public static void func2(String str, int i, String ans) {
        if (i == str.length() - 1) {
            System.out.println(ans + str.charAt(i) + "");
            return;
        }
        
        char ch = str.charAt(i);
        if (ch != str.charAt(i + 1)) {
            func2(str, i + 1, ans + ch);
        } else {
            func2(str, i + 1, ans);
        }
    }
    
    public static String func1(String str) {
        if (str.length() == 1) {
            return str;
        }
        
        char ch = str.charAt(0);
        String roq = str.substring(1);
        
        String rec = func1(roq);
        
        if (ch != rec.charAt(0)) {
            return ch + rec;
        }
        return rec;
    }
}