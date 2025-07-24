import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = n;
        int sum = 0;
        while(n>0)
        {
            int a = n % 10;
            sum = (sum*10)+a;
            n /= 10;
        }
        if(b == sum)
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }
    }
}
