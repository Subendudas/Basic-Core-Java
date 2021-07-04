package com.functionalPrograms;
import java.util.Scanner;

public class Quadratic 
{
	int a, b, c;
	double firstRoot;
	double secondRoot;

	public void rootCalculation() 
	{
	double delta = (b*b)-(4*a*c);
	double sqrt = Math.sqrt(delta);
		if(delta>0)
	{
        firstRoot = (-b + sqrt)/(2*a);
        secondRoot = (-b - sqrt)/(2*a);
        System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
     }
		else if(delta == 0)
     {
        System.out.println("Roots is :: "+(-b + sqrt)/(2*a));
     }
	}

	public static void main(String[] args) 
	{

		Quadratic obj = new Quadratic();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		obj.a = scan.nextInt();
		System.out.println("Enter the value of b: ");
		obj.b = scan.nextInt();
		System.out.println("Enter the value of c: ");
		obj.c = scan.nextInt();	
		System.out.println("The equation is: " + obj.a + "x^2 + " + obj.b + "x + " + obj.c);
		obj.rootCalculation();
		scan.close();
	}
}