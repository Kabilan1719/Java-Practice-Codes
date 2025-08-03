
public class primeNum {
    static boolean isPrime(int a)
    {
        if(a<=1)
        {
            return false;
        }
        for(int i=1;i<=a/2;i++)
        {
            if(a%i == 0)
            {
                return false;
            }
        }
        return true;

    }

    static void displayPrime(int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        displayPrime(2, 10);
    }
}
