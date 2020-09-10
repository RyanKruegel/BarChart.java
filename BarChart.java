// Barchart.java

// Author: Ryan K


	// Import Statement
	import java.util.Scanner;



	// Class Header
	public class BarChart
{


	// Main Method Header
	public static void main(String[] args)
	
	{

		// VARIABLE(s) and CONSTANT(s)
		int artPoints;
		int bobPoints;
		int calPoints;
		int danPoints;
		int eliPoints;

		// INPUT(s)
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the points earned by Art: ");
		artPoints = input.nextInt();

		System.out.print("Please enter the points earned by Bob: ");
		bobPoints = input.nextInt();

		System.out.print("Please enter the points earned by Cal: ");
		calPoints = input.nextInt();

		System.out.print("Please enter the points earned by Dan: ");
		danPoints = input.nextInt();

		System.out.print("Please enter the points earned by Eli: ");
		eliPoints = input.nextInt();

		// CALCULATION
		
		// OUTPUT(s)
		System.out.println();
		System.out.println("Points Earned This Game:");
		displayPoints("Art",artPoints);
		displayPoints("Bob",bobPoints);
		displayPoints("Cal",calPoints);
		displayPoints("Dan",danPoints);
		displayPoints("Eli",eliPoints);

	}

	// METHOD that generates the asterisk characters for the bar chart
	public static void displayPoints(String name, int points)
	{
		System.out.print("\n" + name + ": ");

		for(int x = 1; x <= points; ++x)
		{
			System.out.print("*");
		}
	}
}