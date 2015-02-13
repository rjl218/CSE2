//Ryan Loftus
//lab04- cookies
//calculate the number of cookies someone can have


import java.util.Scanner;

public class Cookies{
    			// main method required for every Java program
   	public static void main(String[] args) {
   	            Scanner myScanner;
   			    myScanner = new Scanner(System.in);
   			    
   			    
   			    //user input
   			    System.out.print("Enter number of people: ");
   			    int nPeople;
   			    
   			    //tests to make sure its an int
   			   if(myScanner.hasNextInt()){
   			        nPeople = myScanner.nextInt();
   			    }
   			    
                else{
                    System.out.println("You did not enter an int.");
                     return;
                }
                //tests sign
                if(nPeople<0){
                    System.out.println("You did not enter an int > 0.");
                    return;
                }
                
   			    
   			    
   			    System.out.print("Enter number of cookies you are planning to buy: ");
   			    int nCookies;
   			    //tests to make sure its an int
   			    if(myScanner.hasNextInt()){
   			        nCookies = myScanner.nextInt();
   			    }
   			    
                else{
                    System.out.println("You did not enter an int.");
                     return;
                }
                //tests sign
                if(nCookies<0){
                    System.out.println("You did not enter an int > 0.");
                    return;
                }
                
                
   			    
   			    System.out.print("How many do you want each person to get?:");
   			    
   			    int nEach;
   			    //tests to make sure its an int
   			    if(myScanner.hasNextInt()){
   			        nEach = myScanner.nextInt();
   			    }
   			    
                else{
                    System.out.println("You did not enter an int.");
                     return;
                }
                //tests sign
   			    if(nEach<0){
                    System.out.println("You did not enter an int > 0.");
                    return;
                }
   			    
   			    //final calculations
                int nTotal = nPeople*nEach;
                
                if(nTotal<=nCookies){
                    System.out.println("You have enough cookies for each person and the amount will divide evenly.");
                }
                else{
                    //calculates how many more cookies are needed
                    int nDifference = nTotal-nCookies;
                    System.out.println("You will not have enough cookies. You need to buy at least " + nDifference + " more.");
                }






}  //end of main method   
  	} //end of class
