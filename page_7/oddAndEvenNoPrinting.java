import java.io.*;
import java.util.*;

public class oddAndEvenNoPrinting {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        print(n);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        print(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}
