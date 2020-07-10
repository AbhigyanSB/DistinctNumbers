/* This program will take 10 numbers
 * from the user, as inputs and display
 * the distinct numbers only (it means
 * that the repeating numbers will be
 * neglected). */

import java.util.Scanner; //importing the Scanner in Java

public class DistinctNumbers {
	//Main Method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creating a Scanner object for the user input

		int[] distinctNums = new int[10]; //creating an array of index 10;
		int number; 				//creating the "number" variable
		int count = 0;			// initializing the variable "count"

		System.out.print("Enter ten numbers: "); //asking the user for 10 numbers
		for (int i = 0; i < 10; i++) { //creating a loop to read the 10 numbers
			number = input.nextInt(); //storing the 10 numbers inside the variable "number"

			if (whetherDistinct(distinctNums, number)) { //calling the method for distinct numbers
				distinctNums[count] = number; //storing the values of "number" inside an array
				count++;	//increasing the "count" 1 time, each time the loop runs
			}
			
		}

		System.out.print("The distinct numbers are:"); //displaying the distinct numbers
		for (int i = 0; i < distinctNums.length; i++) { //running the loop for all the digits inside the array "distinctNums"
			if (distinctNums[i] > 0) //creating a loop for the numbers inside the array, which are larger than "0"
				System.out.print(" " + distinctNums[i]); //displaying the numbers inside the array, which are larger than "0"
		}
		input.close();
	}

	public static boolean whetherDistinct(int[] array, int number) { //method to find the distinct numbers
		for (int i = 0; i < array.length; i++) { //creating a loop for all the numbers inside the array
			if (number == array[i]) //to neglect the repeated numbers
				return false; //returning false if the number is inside the array
		}
		return true; //returning true if the number is not inside array
	}
}