package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = {"1","2","3","4","5"};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2]= "hi.";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int[]ints = new int[250];
		int yay = 0;
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 100000; i++) {
			
		 yay = yay+1;
		for (int l = 0; l < ints.length; l++) {
			Random rd = new Random();
			ints[l] = rd.nextInt(250) ;
			System.out.println(ints[l]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int currentsn = 250 ;
		for (int h = 0; h < ints.length; h++) {
			if (ints[h] < currentsn) {
				currentsn = ints[h] ;
			}
		}
		System.out.println(currentsn +" is the smallest number.");
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int currentln = -1 ;
		for (int o = 0; o < ints.length; o++) {
			if (ints[o] > currentln) {
				currentln = ints[o] ;
			}
		}
		System.out.println(currentln + " is the largest number.");
		if (currentsn >9) {
			System.out.println("It took " + yay + " times to get above 10 as the smallest number.");
			System.exit(0);
		}
		}
	}
}
