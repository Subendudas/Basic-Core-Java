import java.util.Scanner;

	public class HarmonicNumber {
		public static void main(String[] args) {

			HarmonicNumber obj = new HarmonicNumber();
			Scanner sc = new Scanner(System.in);
			System.out.println("Which Harmonic number you want:");
			obj.n = sc.nextInt();
			obj.Harmonic();
			sc.close();

		}

		int n;

		void Harmonic() {
			if (n == 0)
				System.out.println("Please Enter Other Than 0");

			else {
				float harmonic = 1;

				for (int i = 2; i <= n; i++) {
					harmonic += (float) 1 / i;
				}
				System.out.println("Here is your harmonic number "+harmonic);
			}
		}

	}
