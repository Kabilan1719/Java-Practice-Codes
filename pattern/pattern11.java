
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
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
                if(j==1 || j==b)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
            if(i<=n/2)
            {
                a--;
                b +=2;
            }
            else
            {
                a++;
                b -=2;
            }
            
        }
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;i<=n-4;i++)
        //     {

        //     }
        // }
    }
}
