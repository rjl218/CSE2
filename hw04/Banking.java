//Ryan Loftus
//hw04- Banking
//program processes bank statements



import java.util.Scanner;
import java.util.Random;

public class Banking{
    			// main method required for every Java program
   	public static void main(String[] args) {
   	            Scanner myScanner;
   			    myScanner = new Scanner(System.in);
   			    
   			    
   			    Random ran = new Random();
                int initialBalance = ran.nextInt(4001) + 1000;
   			    int finalBalance;
   			    System.out.println("Your balance is $" + initialBalance + ".");
   			    System.out.print("Enter 1 to deposit, 2 to withdraw, and 3 to view balance: ");
   			    int choice = myScanner.nextInt();
   			    
   			    switch(choice){
   			        case 1:
   			            System.out.print("How much would you like to add? ");
   			            int deposit = myScanner.nextInt();
   			            
   			            if(deposit>=0){
   			                finalBalance = initialBalance+deposit;
   			                System.out.println("Your balance is $" + finalBalance + ".");
   			            }
   			            else{
   			                System.out.println("Error: Invalid Input");
   			            }
   			            break;
   			        case 2:
   			            System.out.print("How much would you like to withdraw? ");
   			            int withdraw = myScanner.nextInt();
   			            
   			            if(withdraw>=0 && withdraw<=initialBalance){
   			                finalBalance= initialBalance-withdraw;
   			                System.out.println("Your balance is $" + finalBalance + ".");
   			            }
   			            else{
   			                System.out.println("Error: Invalid Input");
   			            }
   			            break;
   			        case 3:
   			            System.out.println("Your balance is $" + initialBalance + ".");
   			            
   			    }
   			    
   			    
   			    
   			    
   			    
   			    
   	}
   	
}