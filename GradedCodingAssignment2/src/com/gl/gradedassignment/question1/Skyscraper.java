package com.gl.gradedassignment.question1;

import java.util.Scanner;

public class Skyscraper {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// Accept the total number of floors available
		System.out.println("Enter the total number of floors in the building: ");
		int n = sc.nextInt();
		// Declare an array to store the size of each floor
		int day[] = new int[n + 1];
		// Iterate through 1 to n floors/days
		for (int i = 1; i <= n; i++) {
			// Accept the size of the floor
			System.out.println("Enter the floor size given on day " + i + ":");
			int size = sc.nextInt();
			// Store the day in the array with the index of the size of the floor
			try {
				day[size] = i;

			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Entered floor size is Invalid");
				i--;
			}
		}
		
		sc.close();

		// Declare a temporary variable
		int temp = n;

		// Declare a flag variable to check the condition when required
		int flag;
		System.out.println("The order of construction is as follows: \n");

		// Iterate through 1 to n floors/days
		for (int i = 1; i <= n; i++) {
			// Initialize flag to 0 for each iteration
			flag = 0;
			System.out.println("Day: " + i);
			// Find the floor with the highest size available
			while (temp >= 1 && day[temp] <= i) {
				// Update the flag
				flag = 1;
				// Print the floor
				System.out.print(temp + " ");
				// Find the next highest floor available
				temp--;
			}
			// If flag is updated
			if (flag == 1) {
				// Proceed to the next day
				System.out.println();
			} else {
				System.out.println();
			}
		}
	}
}
