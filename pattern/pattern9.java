import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            a--;
        }
    
    }
}

//    1
//   121
//  12321
// 1234321
//123454321
