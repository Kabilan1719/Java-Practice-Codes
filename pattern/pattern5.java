import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
                if(j>i)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
