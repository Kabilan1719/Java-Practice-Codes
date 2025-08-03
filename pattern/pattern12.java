import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2)
            a += 2;
            else
            a -= 2;
        }
    }
}
