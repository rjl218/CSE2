//Ryan Loftus
//hw03
//Root
//2/7/15
//receives double and finds roots

import java.util.Scanner;

public class Root {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter a double and I find its root: ");
        double x = myScanner.nextDouble();
        
        double guess = x/3;
        
        double guess2 = (guess*guess*guess+x)/(3*guess*guess);
        double guess3 = (guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (guess4*guess4*guess4+x)/(3*guess4*guess4);
        
        double guessCubed = guess5 * guess5 * guess5;
        
        System.out.println("The cube root is " + guess5 + ": " + guess5 + "*" + guess5 + "*" + guess5 + "= " + guessCubed);
        
        
        
        
        
        
        
        
   	}
   	
   	
   	
}