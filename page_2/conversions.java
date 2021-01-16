import java.io.*;
import java.util.*;

public class conversions {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
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
}