import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        reverse(arr, k, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print(arr[k]);
    }
    
    public static void reverse(int[] arr, int i, int si, int ei) {
        if ( si >= ei ) {
            return;
        }
        
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
        
        reverse(arr, i, si + 1, ei - 1);
    }
}