//Ryan Loftus
//hw03
//FourDigits
//2/7/15
//this program extracts data from a double

import java.util.Scanner;

public class FourDigits {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner;
        myScanner = new Scanner( System.in );
        
         //double n = 1.1234;
         System.out.print("Enter a double with four decimal places: ");
         double n = myScanner.nextDouble();
         n = n*10000;
         
         
         //int N = (int) n;
        // N = N*10000;
         int nN = (int) n;
         
         System.out.println(nN + "\n");
         
        while(nN>10000){ 
         if (nN<100000 && nN>10000)
         {
            nN-=10000;
         }
         if (nN<1000000 && nN>100000)
         {
            nN-=100000;
         }
         if (nN<10000000 && nN>1000000)
         {
            nN-=1000000;
         }
         if (nN<100000000 && nN>10000000)
         {
            nN-=10000000;
         }
         if (nN<1000000000 && nN>100000000)
         {
            nN-=100000000;
         }
        }
         System.out.println(n);
      //   System.out.println(N);
         System.out.println(nN);
        
        
        
        
        
        
   	}
   	
   	
}