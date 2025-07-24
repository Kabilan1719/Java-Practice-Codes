
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while(n>0)
        {
            int a = n % 10;
            sum = (sum*10)+a;
            n /= 10;
        }
        System.out.println(sum);
    }
}
