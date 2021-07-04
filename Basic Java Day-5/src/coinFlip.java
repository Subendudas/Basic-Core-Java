	import java.util.Scanner;

	public class coinFlip {
		public static void main(String[] args) 
		{
			System.out.println("Please! Enter The Number Times You Want To Flip A Coin:");
			//coinFlip obj1 = new coinFlip();
			Scanner sc = new Scanner(System.in);
			coinFlip obj = new coinFlip();
			obj.Number = sc.nextInt();
			obj.HeadTail();
			obj.viewPercentage();
			sc.close();

		}

		int Number;
		int head = 0;
		int tail = 0;

		void HeadTail() {

			Number = Math.abs(Number);

			for (int i = 0; i < Number; i++) 
			{
				double random = Math.random();
				if (random < 0.5) 
				{
					tail++;
					System.out.println("Tail");
				} 
				else 
				{
					head++;
					System.out.println("Head");
				}
			}
		}

		void viewPercentage() {

			float HeadPercent;
			float TailPercent;

			HeadPercent = (float) ((head * 100) / Number);
			TailPercent = (float) ((tail * 100) / Number);
			System.out.println("Head Percentage is " + HeadPercent + "%");
			System.out.println("Tail Percentage is " + TailPercent + "%");
		}

		
	}

