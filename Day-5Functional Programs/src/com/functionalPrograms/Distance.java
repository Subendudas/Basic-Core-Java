package com.functionalPrograms;
import java.util.Scanner;
public class Distance 
{
	int x;
	int y;
void euclideanDistance() 
	{	
	double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
	System.out.println("The Euclidean distance is: " +distance+ " units.");
		}
	    public static void main(String[] args) 
	 {
	   	Distance obj = new Distance();
	    System.out.print("Enter X: ");
	   
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Y: ");
	    obj.x = scan.nextInt();
        obj.y = scan.nextInt();
        obj.euclideanDistance();
	    scan.close();
	    }

}