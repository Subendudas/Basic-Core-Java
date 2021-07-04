import java.util.Scanner;
public class LargestofThree
{
	public static void main(String[] args) 
	{
		LargestofThree obj = new LargestofThree();
		System.out.println("Welcome to largest of three number program");
		obj.display();
	}

		int num1;
		int num2;
		int num3;

		void display() 
		{

			Scanner sc = new Scanner(System.in);
			LargestofThree obj = new LargestofThree();
			System.out.println("Enter First number");
			obj.num1 = sc.nextInt();
			System.out.println("Enter Second number");
			obj.num2 = sc.nextInt();
			System.out.println("Enter Third number");
			obj.num3 = sc.nextInt();
			sc.close();
			obj.compare();

		}

		void compare() 
		{
			if ((num1 > num2) && (num1 > num3)) 
			{
				System.out.println(num1 + " is greatest");
			} 
			else if (num2 > num3) 
			{
				System.out.println(num2 + " is greatest");
			} 
			else 
			{
				System.out.println(num3 + " is greatest");
			}

		}
	}
