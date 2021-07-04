import java.util.Scanner;
public class PrimeFactor 
{
	int n;
	void primefactor() 
	{
		while (n % 2 == 0) 
			{
				System.out.print(2+ " ");
				n = n / 2;
			}

			for (int i = 3; i <= n; i = i + 2) 
			{
				while (n % i == 0)
{
					System.out.println(i + " ");
					n = n / i;
				}
			}
			if(n > 2)
				System.out.print(n);
				
		}

		public static void main(String[] args) 
		{

			Scanner scan = new Scanner(System.in);
			PrimeFactor obj = new PrimeFactor();
			System.out.println("Enter number: ");
			obj.n = scan.nextInt();
			obj.primefactor();
			scan.close();
		}
	}
