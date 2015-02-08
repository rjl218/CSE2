//Ryan Loftus
//hw03
//Bicycle
//2/7/15
//program stores data from bicycle trips

import java.util.Scanner;

public class Bicycle {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //receives user input
        System.out.print("Enter the number of counts: ");
        Double nCounts = myScanner.nextDouble();
        
        System.out.print("Enter the number of seconds: ");
        Double nSeconds = myScanner.nextDouble();
        
        
        //constants
        double diameter = 27; //inches
        double wheelDiameter=27.0,  //
    	PI=3.14159, //
    	feetPerMile=5280,  //
    	inchesPerFoot=12,   //
    	secondsPerMinute=60,  //
    	secondsPerHour=60;
        double circumference = PI * 27;
        
        //calculations
        double inchesTraveled = nCounts * circumference;
        double nMinutes = nSeconds/secondsPerMinute;
        double nHours = nSeconds/secondsPerMinute/secondsPerHour;
        
        double milesTraveled = inchesTraveled/inchesPerFoot/feetPerMile;
        double mphAvg= milesTraveled/nHours;
        
        System.out.println("The distance was " + milesTraveled + " miles and took " + nMinutes + " minutes.");
        System.out.println("The average mph was " + mphAvg + ".");
        
   	}
   	
}