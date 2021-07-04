package com.functionalPrograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temperature value in Fahrenheit: ");
		double t = scan.nextDouble(); // t=temperature
		System.out.println("Enter  Wind speed in miles per hour: ");
		double v = scan.nextDouble(); // v=wind speed
		scan.close();
		if (Math.abs(t) <= 50) 
		{
			if (v >= 3 && v <= 120) 
			{
				calculateChill(t, v);
			} 
			else
				System.out.println("Wrong input! Wind-Speed cannot be higher than 120 or less than 3");
		} 
		else
			System.out.println("Temperature cannot be higher than 50 degree Fahrenheit in absolute value");
	}

	private static void calculateChill(double t, double v) {
		double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		wind = (int)(wind*100)/100.0;
		System.out.println("Wind chill value is: " + wind + " units.");
	}
}