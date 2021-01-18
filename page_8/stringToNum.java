import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int div = scn.nextInt();
        System.out.println(numToString(str, str.length() - 1, 1) / div);
    }
    
    public static long numToString(String str, int idx, long pow) {
        if (idx == -1) {
            return 0;
        }
        long recAns = numToString(str, idx - 1, pow * 10);
        return recAns + (str.charAt(idx) - '0') * pow ;
    }
}