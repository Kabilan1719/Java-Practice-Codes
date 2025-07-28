
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //pramid
        int a = n-1;
        int b = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=b;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            a--;
            b +=2;
        }
    }
}
