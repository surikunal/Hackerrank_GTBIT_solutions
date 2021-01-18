import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(Palindrome(arr, 0, arr.length-1));
    }
    public static boolean Palindrome(int[] arr,int si,int ei){
        if (si >= ei) {
            return true;
        }
        
        if ( arr[si] != arr[ei] ) {
            return false;
        }
        
        return Palindrome(arr, si + 1, ei - 1);
    }
}