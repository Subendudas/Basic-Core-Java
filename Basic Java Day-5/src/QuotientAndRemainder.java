import java.util.Scanner;
public class QuotientAndRemainder {
	int Dividend;
	int Divisor;

	void forQuotient() {
		int Quotient = Dividend / Divisor;
		System.out.println("Quotient is: " + Quotient);

	}

	void forRemainder() {
		int Remainder = Dividend % Divisor;
		System.out.println("Remainder is: " + Remainder);

	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		QuotientAndRemainder obj = new QuotientAndRemainder();
		System.out.print("Enter the value of Dividend: ");
		obj.Dividend = scan.nextInt();
		System.out.print("Enter the value of Divisor: ");
		obj.Divisor = scan.nextInt();
		obj.forQuotient();
		obj.forRemainder();
		scan.close();

	}
}
