
import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        int b = 0;
        while(n>0)
        {
            int a = n % 10;
            b += a * (int)Math.pow(2, i);
            i++;
            n /= 10;
        }
        System.out.println(b);
    }
}
