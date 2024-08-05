package com.Aurionpro.Operators;

public class Logical {
	public static void main(String[] args) {
        System.out.println("BOOLEAN OPERATORS	");
	 	boolean aa = true;
        boolean bb = false;

        System.out.println("a: " + aa);
        System.out.println("b: " + bb);
        System.out.println("a && b: " + (aa && bb));
        System.out.println("a || b: " + (aa || bb));
        System.out.println("!a: " + !aa);
        System.out.println("!b: " + !bb);
        
        
        System.out.println("\n\nAND &&");
     // initializing variables
        int a = 10, b = 20, c = 20, d = 0;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        // using logical AND
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
        
        System.out.println("\n\nOR ||");
        if (a > b || c == d)
            System.out.println("One or both + the conditions are true");
        else
            System.out.println("Both the + conditions are false");
        
        System.out.println("\n\n NOT !");
     // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
        
    }
}
