import java.util.Scanner;
public class VowelAndConsonents 
{
	char Aplhabet;

	void check() 
	{
		if ((Aplhabet == 'a') || (Aplhabet == 'e') || (Aplhabet == 'i') || (Aplhabet == 'o') || (Aplhabet == 'u')) 
		{
			System.out.println(Aplhabet+" is Vowel.");
		}
		else 
		{
			System.out.println(Aplhabet+" is Consonant.");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VowelAndConsonents obj = new VowelAndConsonents();
		System.out.print("Enter Any Aplhabet: ");
		obj.Aplhabet = scan.next().charAt(0);
		obj.check();
		scan.close();
	}
}
