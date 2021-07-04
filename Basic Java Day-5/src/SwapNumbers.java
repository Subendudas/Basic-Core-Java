import java.util.Scanner;
public class SwapNumbers 
{
	int First_num;
	int Second_num;

	void swap() 
	{
		int temp = First_num;
		First_num = Second_num;
		Second_num = temp;
		System.out.println("Swapped!! Now The First Number is -> "+ First_num + " & The Second Number is -> " + Second_num);

	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		SwapNumbers obj = new SwapNumbers();
		System.out.print("Enter The First Number: ");
		obj.First_num = scan.nextInt();
		System.out.print("Enter The Second Number: ");
		obj.Second_num = scan.nextInt();
		obj.swap();
		scan.close();
	}
}
