//Ryan Loftus
//hw04- WhichNumber
//guess which number a user is thinking of


import java.util.Scanner;

public class WhichNumber{
    			// main method required for every Java program
   	public static void main(String[] args) {
   	            Scanner myScanner;
   			    myScanner = new Scanner(System.in);
   			    
   			    System.out.println("Think of a number between 1 and 10 inclusive.");
   			    System.out.println("Enter Y or y for yes and N or n for no.");
   			    
   			    
   			    System.out.print("Is your number even? ");
   			    String by2 = myScanner.next();
   			   // String evenTest 
   			    if(by2.equals("Y") || by2.equals("y")){
   			        System.out.print("Is your number divisible by 3? ");
   			        String by3 = myScanner.next();
   			        
   			        
   			        if(by3.equals("Y") || by3.equals("y")){
   			            System.out.println("Your number is 6.");
   			            return;
   			        }
   			        
   			        else if(by3.equals("N") || by3.equals("n")){
   			            System.out.print("Is your number number divisible by 4? ");
   			            String by4 = myScanner.next();
   			        
   			            if(by4.equals("Y") || by4.equals("y")){
   			                System.out.print("Is the number divided by four greater than one? ");
   			                String by4MoreThan1 = myScanner.next();
   			                
   			                if(by4MoreThan1.equals("Y") || by4MoreThan1.equals("y")){
   			                    System.out.println("Your number is 8.");
   			                }
   			                else if(by4MoreThan1.equals("N") || by4MoreThan1.equals("n")){
   			                    System.out.println("Your number is 4.");
   			                }
   			                
   			                else{
   			                    System.out.println("Sorry that is not a valid input. ");
   			                    return;
   			                    }
   			                
   			            }
   			            
   			            else if(by4.equals("N") || by4.equals("n")){
   			                System.out.print("Is the number divisible by 5? ");
   			                String by5 = myScanner.next();  
   			                
   			                if(by5.equals("Y") || by5.equals("y")){
   			                     System.out.println("Your number is 10.");
   			                }
   			                
   			                else if(by5.equals("N") || by5.equals("n")){
   			                     System.out.println("Your number is 2.");
   			                    
   			                }
   			                
   			                else{
   			                    System.out.println("Sorry that is not a valid input. ");
   			                    return;
   			                    }
   			                
   			            }
   			            
   			            else{
   			                System.out.println("Sorry that is not a valid input. ");
   			                return;
   			                }
   			            
   			            
   			        }
   			        else{
   			        System.out.println("Sorry that is not a valid input. ");
   			        return;
   			          }
   			        
   			        
   			    }
   			    else if(by2.equals("N") || by2.equals("n")){
   			          
   			        System.out.print("Is your number divisible by 3? ");
   			        String by3b = myScanner.next();
   			        
   			        
   			        if(by3b.equals("Y") || by3b.equals("y")){
   			            System.out.print("When divided by 3 is the result greater than 1? ");
   			            String by3MoreThan1 = myScanner.next();
   			            if(by3MoreThan1.equals("Y") || by3MoreThan1.equals("y")){
   			                System.out.println("Your number is 9.");
   			                
   			            }
   			            else if(by3MoreThan1.equals("Y") || by3MoreThan1.equals("y")){
   			                System.out.println("Your number is 3.");
   			            }
   			            else{
   			                System.out.println("Sorry that is not a valid input. ");
   			                return;
   			                }
   			        }
   			        
   			        else if(by3b.equals("N") || by3b.equals("n")){
   			            
   			            
   			            System.out.print("Is it greater than 6? ");
   			            String moreThan6 = myScanner.next();  
   			                
   			                if(moreThan6.equals("Y") || moreThan6.equals("y")){
   			                     System.out.println("Your number is 7.");
   			                }
   			                
   			                else if(moreThan6.equals("N") || moreThan6.equals("n")){
   			                     
   			                     System.out.print("Is it less than 3? ");
   			                     String lessThan3 = myScanner.next();  
   			                
   			                    if(lessThan3.equals("Y") || lessThan3.equals("y")){
   			                     
   			                     System.out.println("Your number is 1.");
   			                        
   			                    }
   			                    
   			                    else if(lessThan3.equals("Y") || lessThan3.equals("y")){
   			                     
   			                     System.out.println("Your number is 5.");
   			                        
   			                    }
   			                    
   			                    else{
   			                     System.out.println("Sorry that is not a valid input. ");
   			                        return;
   			                    }
   			                     
   			                    
   			                }
   			                
   			                else{
   			                    System.out.println("Sorry that is not a valid input. ");
   			                    return;
   			                    }
   			            
   			        }
   			        
   			    
   			        else{
   			            System.out.println("Sorry that is not a valid input. ");
   			            return;
   			    }
   			    
   			    }
   			    else{
   			        System.out.println("Sorry that is not a valid input. ");
   			        return;
   			    }
   			    
   		
   		
   		
   		
   			    
   			    
   			    
   	}
   	
   	
   	
}