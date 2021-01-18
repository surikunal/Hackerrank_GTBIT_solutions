import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(SumOfDigits(str, 0));
    }
    
    public static int SumOfDigits(String str, int i) {
        if (i == str.length()) {
            return 0;
        }
        
        int recAns = SumOfDigits(str, i + 1);
        return recAns + str.charAt(i) - '0';
    }
}