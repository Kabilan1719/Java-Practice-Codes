
import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int i = 1;
        while(n>0)
        {
            int a = n % 2;
            sum = (a*i)+sum;
            i *= 10;
            n /= 2;
        }
        System.out.println(sum);
    }
}
