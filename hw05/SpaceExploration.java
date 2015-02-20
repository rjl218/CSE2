//Ryan Loftus
//lab05- SpaceExploration
//print the events that occured in certain years


import java.util.Scanner;
import java.util.Random;

public class SpaceExploration{
    			// main method required for every Java program
   	public static void main(String[] args) {
   	            
   	            //generates random year
   	            Random ran = new Random();
                int year = ran.nextInt(11) + 2000;
   	    
   	            //test
   	            //System.out.println(year); 
   	           if(year>2000){
   	             System.out.println("Here is a timeline of space exploration events from " + year + " to 2000:");
   	           }
   	           else{
   	               System.out.println("Here is a list of events that happened in 2000:");
   	           }
   	            switch(year){
   	                case 2010:
   	                    System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back.");
   	                case 2009:
   	                    System.out.println("2009: N/A");
   	                case 2008:
   	                    System.out.println("2008: Kepler launched to study deep space.");
   	                case 2007:
   	                    System.out.println("2007: N/A");
   	                case 2006:
   	                    System.out.println("2006: Spacecraft returns with collections from a comet.");
   	                case 2005:
   	                    System.out.println("2005: Spacecraft collies with comet.");
   	                case 2004:
   	                    System.out.println("2004: N/A");
   	                case 2003:
   	                    System.out.println("2003: Largest infared telescope released.");
   	                case 2002:
   	                    System.out.println("2002: N/A");
   	                case 2001:
   	                    System.out.println("2001: First spacecraft lands on asteroid.");
   	                case 2000:
   	                    System.out.println("2000: First spacecraft orbits an asteroid.");
   	                    //break;
   	                
   	            }
   	    
   	    
   	}
   	
}