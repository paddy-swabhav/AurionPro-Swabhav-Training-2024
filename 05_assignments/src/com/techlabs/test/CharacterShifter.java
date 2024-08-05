package com.techlabs.test;

import java.util.Scanner;

public class CharacterShifter {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input_string = scanner.nextLine();
        System.out.print("Enter the shift value: ");
        int n = scanner.nextInt();

        char result[] = new char[input_string.length()];

        // character shifting
        for (int i = 0; i < input_string.length(); i++) {
            char c = input_string.charAt(i);
            if (Character.isUpperCase(c)) 
            {
                result[i] = (char) ((c - 'A' + n + 26) % 26 + 'A');
            } 
            else if (Character.isLowerCase(c)) 
            {
                result[i] = (char) ((c - 'a' + n + 26) % 26 + 'a');
            } 
            else 
            {
                result[i] = c; 
            }
        }

        // Convert the result character array to a string and print the result
        System.out.println("Shifted string: " + new String(result));
	
	}

}
