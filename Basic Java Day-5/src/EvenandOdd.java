import java.util.Scanner;

public class EvenandOdd {
	int number;

	void check() 
	{
		int a = number % 2;
		if (a == 0) 
		{
			System.out.println("It is an Even number.");
		} 
		else 
		{
			System.out.println("It is an Odd number.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenandOdd obj = new EvenandOdd();
		System.out.println("Please! Enter Any Number:");
		obj.number = sc.nextInt();
		obj.check();
		sc.close();

	}

}
