import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;
        int c = n;
        //int count = (n+"").length();
        int i = 0;
        while(n>0)
        {
            i++;
            n /= 10;
        }
        int sum = 0;
        while(a>0)
        {
            int b= a%10;
            // sum += (int)Math.pow(b, i);
            int prod = 1;
            for(int j=0;j<i;j++)
            {
                prod *= b;
            }
            sum += prod;
            a /= 10;
        }
        if(c == sum)
        {
            System.out.println("It is a armstrong number");
        }
        else
        {
            System.out.println("It is not a armstrong number");
        }
    }
}
