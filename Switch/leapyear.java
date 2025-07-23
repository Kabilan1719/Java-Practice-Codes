import java.util.Scanner;
class leapyear
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month:");
        int m = s.nextInt();
        System.out.println("Enter the year:");
        int y = s.nextInt();
        switch(m)
        {
            case 1:
            case 3:
            case 5:System.out.println("31 days");
                    break;
            case 4:
            case 6:System.out.println("30 days");
                    break;
            case 2:
                if(y%400 == 0 || (y % 4 == 0 && y % 100 != 0))
                {
                    System.out.println("29 days");
                }
                else
                {
                    System.out.println("28 days");
                }
        }
    }
}