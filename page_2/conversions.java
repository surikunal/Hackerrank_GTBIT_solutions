/* import java.util.*;

public class conversions {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int sn = scn.nextInt();
        int sb = scn.nextInt();
        int db = scn.nextInt();
        System.out.println(print(sn, sb, db));
    }
    
    public static int print(int sn, int sb, int db) {
        int btd = baseToDecimal(sn, sb);
        int dtb = decimalToBase(btd, db);
        return dtb;
    }
    
    public static int baseToDecimal(int sn, int sb) {
        int ans = 0;
        int power = 1;
        while (sn > 0) {
            int rem = sn % 10;
            sn /= 10;
            
            ans += rem * power;
            power *= sb;
        }
        return ans;
    }
    
    public static int decimalToBase(int sn, int db) {
        int ans = 0;
        int power = 1;
        while (sn > 0) {
            int rem = sn % db;
            sn /= db;
            
            ans += rem * power;
            power *= 10;
        }
        return ans;
    }
} */

import java.util.*;

public class conversions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[][] arr = new int[n][2];
            for (int j = 0; j < n; j++) {
                arr[j][0] = scn.nextInt();
                arr[j][1] = scn.nextInt();
            }
            System.out.println(maxRange(k, arr));
        }
    }

    public static int maxRange(int k, int[][] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int si = arr[i][0];
            int ei = arr[i][1];

            if (si >= 0 && si < arr.length) {
                ans[si]++;
            }

            if (ei + 1 >= 0 && ei + 1 < arr.length) {
                ans[ei + 1]--;
            }
        }

        int[] psak = new int[ans.length];
        int[] psakp1 = new int[ans.length];

        if (ans[0] == k) {
            psak[0]++;
        }
        if (ans[0] == k + 1) {
            psakp1[0]++;
        }

        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i] + ans[i - 1];
            if (ans[i] == k) {
                psak[i]++;
            }
            if (ans[i] == k + 1) {
                psakp1[i]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int si = arr[i][0];
            int ei = arr[i][1];

            int loss = 0, profit = 0;
            if (si - 1 >= 0 && ei < arr.length) {
                loss = psak[ei] - psak[si - 1];
            }
            if (si - 1 >= 0 && ei < arr.length) {
                profit = psakp1[ei] - psakp1[si - 1];
            }
            max = Math.max(max, ans[i] - loss + profit);
        }

        return max;
    }
}