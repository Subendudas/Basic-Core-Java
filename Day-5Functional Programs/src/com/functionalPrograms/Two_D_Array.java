package com.functionalPrograms;
import java.util.Scanner;

public class Two_D_Array 
{
	void display() 
	{
		 int i, j;
		 Scanner scan = new Scanner(System.in);
	     System.out.print("Enter row for the array: ");
	     int row = scan.nextInt();
	     System.out.print("Enter column for the array: ");
	     int col = scan.nextInt();
	     int arr[][] = new int[row][col];
		   
	     System.out.println("Enter " +(row*col)+ " Array Elements : ");
	     for(i=0; i<row; i++)
	     {
	         for(j=0; j<col; j++)
	         {
	             arr[i][j] = scan.nextInt();
	         }
	     }
	     System.out.print("The Array is :\n");
	     for(i=0; i<row; i++)
	     {
	         for(j=0; j<col; j++)
	         {
	             System.out.print(arr[i][j]+ "  ");
	         }
	         System.out.println();
	     }
	 }
	public static void main(String args[]) {
		Two_D_Array obj = new Two_D_Array();
		obj.display();
	}
}