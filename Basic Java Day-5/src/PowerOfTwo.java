
public class PowerOfTwo {
	int n;

	PowerOfTwo(int n) {
		this.n = n;
	}

	void function() {
		for (int i = 1; i <= n; i++) {
			int value = (int) Math.pow(2, i);
			System.out.println("2^" + i + "=" + value);
		}

	}

	public static void main(String[] args) {
		int num = 0;
		num = Integer.parseInt(args[0]);
		PowerOfTwo obj1 = new PowerOfTwo(num);
		obj1.function();
	}
}
