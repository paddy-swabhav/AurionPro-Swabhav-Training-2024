package com.techlabs.assignments;
import java.util.*;

public class PrimePatternPrinter {
	
	static boolean isPrime(int n){
        if(n==1||n==0)return false;

        for(int i=2; i<Math.sqrt(n); i++){
              if(n%i==0)return false;
        }
        return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr NUMBER OF LINES: ");
		int i,j,k=2,no_of_lines=sc.nextInt();
		
		for(i=1;i<=no_of_lines;i++)
		{	
			for(j=1;j<=i;j++) 
			{
			
				while(true){
		            //check if current number is prime
		            if(isPrime(k)) {
		            	System.out.print(" "+k+"\t");
		            	break;
		            }
		            k++;
				}
				k++;
			}
			System.out.println("\n");
		}
	}
}
