import java.util.Scanner;
class leapyear
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n % 400 == 0)
		{
			System.out.println("It is a Leap Year");
		}
		else
		{
			if(n % 4 == 0 && n % 100 != 0)
			{
				System.out.println("It is a Leap Year");
			}
			else
			{
				System.out.println("It is not a Leap Year");
			}
		}
	}
}