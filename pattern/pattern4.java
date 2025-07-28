import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                // a = (i-1)*n;
                for(int j=1;j<=n;j++)
                {
                    System.out.print(a+" ");
                    a++;
                }
            }
            else
            {
                a = a+(n-1); //a = a+4;
                // a = i*n;
                for(int j=1;j<=n;j++)
                {
                    System.out.print(a+" ");
                    a--;
                }
                a = a+(n+1); //a = a+6;
            }
            System.out.println();
        }
    }
}
