/*
* Created By: Jacob Cassady
* Date Created: 10/30/2016
* Last Updated: 10/30/2016
* 
* Problem Statement: Write a program called ReverseString,which prompts user for a String, and prints the reverse
* of the String.
*/

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input;
		
		System.out.print("Please enter a string for me to reverse: ");
		input = scan.nextLine();
		scan.close();
		
		input = reverseString(input);
		
		System.out.println(input);
	}
	
	static String reverseString(String input){
		String output = "";

		for(int i = (input.length()-1) ; i >= 0; i--){
			output += input.charAt(i);
		}
		
		return output;
	}
}
