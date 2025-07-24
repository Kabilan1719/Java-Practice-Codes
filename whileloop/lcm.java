import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int n = 0;
        int a = 0;
        if(num1>num2)
        {
            a = num1;
        }
        else
        {
            a = num2;
        }
        for (int i = 1; i < a; i++) {
            if((num1 %i == 0) && (num2 %i == 0))
            {
                n = i;
            }
        }
        System.out.println((num1*num2)/n);
    }
}
