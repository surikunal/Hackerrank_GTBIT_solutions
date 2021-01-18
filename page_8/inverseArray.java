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
        inverse(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k = scn.nextInt();
        System.out.println(arr[k]);
    }
    
    public static void inverse(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        
        int val = arr[i];
        inverse(arr, i + 1);
        arr[val] = i;
    }
}