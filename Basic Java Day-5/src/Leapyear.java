import java.util.Scanner;
public class Leapyear {

		public static int i;

		void leap() {
			Scanner year = new Scanner(System.in);
			System.out.println("Enter Year: ");
			int i = year.nextInt();

			int a = i % 400;
			int b = i % 100;
			int c = i % 4;

			if (a == 0)
				System.out.println(i+" is a leap year.");
			else if (b == 0)
				System.out.println(i+" is not a leap year.");
			else if (c == 0)
				System.out.println(i+" is a leap year.");
			else
				System.out.println(i+" is not a leap year.");
			year.close();

		}

		public static void main(String[] args) {

			Leapyear obj = new Leapyear();
			obj.leap();

		}
	}
