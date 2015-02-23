//Ryan Loftus
//hw05
//ToHex
//2/22/15
//converts decimals to hexidecimals

import java.util.Scanner;

public class ToHex {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //user input
        
        System.out.println("Please enter three numbers representing RGB values: ");
        int red;
        if(myScanner.hasNextInt()){
   		 red = myScanner.nextInt();
   	    }
   			    
        else{
            System.out.println("You did not enter an int.");
            return;
        }
        
        
        int green;
        
        if(myScanner.hasNextInt()){
   		 green = myScanner.nextInt();
   	    }
   			    
        else{
            System.out.println("You did not enter an int.");
            return;
        }
        int blue;
        if(myScanner.hasNextInt()){
   		 blue = myScanner.nextInt();
   	    }
   			    
        else{
            System.out.println("You did not enter an int.");
            return;
        }
        
        
        //test to make sure values are between 0-255
        if(red<0 || red>255 || green<0 || green>255 || blue<0 || blue>255){
            System.out.println("Sorry the inputs must be in the range of 0-255.");
        }
        
        //calculates the number of times variable red can be divided by 16
        int r = red;
        int counterR = 0;
        while(r>=16){
            counterR+=1;
            r= r -16;
            //System.out.println(r);
        }
        
        int g = green;
        int counterG = 0;
        while(g>=16){
            counterG+=1;
            g= g -16;
            //System.out.println(g);
        }
        int b = blue;
        int counterB = 0;
        while(b>=16){
            counterB+=1;
            b= b -16;
            //System.out.println(b);
        }
        
         //calculates remainder
        int redMod= red%16;
        int greenMod= green%16;
        int blueMod= blue%16;
        
        
        //the switch statements are used to convert the counter or mod to a letter if it is above nine
         
        char rR = 0;
        switch(counterR){
            
            case 10:
                rR = 'A';
                break;
            case 11:
                rR = 'B';
                break;
            case 12:
                rR = 'C';
                break;
            case 13:
                rR = 'D';
                break;
            case 14:
                rR = 'E';
                break;
            case 15:
                rR = 'F';
                break;
            default:
            break;
            
        }
        char gG = 0;
        switch(counterG){
            case 10:
                gG = 'A';
                break;
            case 11:
                gG = 'B';
                break;
            case 12:
                gG = 'C';
                break;
            case 13:
                gG = 'D';
                break;
            case 14:
                gG = 'E';
                break;
            case 15:
                gG = 'F';
                break;
        }
        char bB = 0;
        switch(counterB){
            case 10:
                bB = 'A';
                break;
            case 11:
                bB = 'B';
                break;
            case 12:
                bB = 'C';
                break;
            case 13:
                bB = 'D';
                break;
            case 14:
                bB = 'E';
                break;
            case 15:
                bB = 'F';
                break;
        }
        
        char rRMod = 0;
        switch(counterR){
            case 10:
                rRMod = 'A';
                break;
            case 11:
                rRMod = 'B';
                break;
            case 12:
                rRMod = 'C';
                break;
            case 13:
                rRMod = 'D';
                break;
            case 14:
                rRMod = 'E';
                break;
            case 15:
                rRMod = 'F';
                break;
        }
        
        char gGMod = 0;
        switch(counterG){
            case 10:
                gGMod = 'A';
                break;
            case 11:
                gGMod = 'B';
                break;
            case 12:
                gGMod = 'C';
                break;
            case 13:
                gGMod = 'D';
                break;
            case 14:
                gGMod = 'E';
                break;
            case 15:
                gGMod = 'F';
                break;
        }
        
        char bBMod = 0;
        switch(counterB){
            case 10:
                bBMod = 'A';
                break;
            case 11:
                bBMod = 'B';
                break;
            case 12:
                bBMod = 'C';
                break;
            case 13:
                bBMod = 'D';
                break;
            case 14:
                bBMod = 'E';
                break;
            case 15:
                bBMod = 'F';
                break;
        }
        
        //decides whether to print the char conversion or the original counter for each color (for how many times divided)
        if (counterR>=10){
            System.out.print(rR);
        }
        else if(counterR<10){
            System.out.print(counterR);
        }
        
        if (counterG>=10){
            System.out.print(gG);
        }
        else if(counterG<10){
            System.out.print(counterG);
        }
        if (counterB>=10){
            System.out.print(bB);
        }
        else if(counterB<10){
            System.out.print(counterB);
        }
        
        //decides whether to print the char conversion or the mod counter for each color (for how many remain after division)
        
        if (redMod>=10){
            System.out.print(rRMod);
        }
        else if(redMod<10){
            System.out.print(redMod);
        }
        
        if (greenMod>=10){
            System.out.print(gGMod);
        }
        else if(greenMod<10){
            System.out.print(greenMod);
        }
        if (blueMod>=10){
            System.out.print(bBMod);
        }
        else if(blueMod<10){
            System.out.print(blueMod);
        }
       
       System.out.println();
        
        
        
        
        
        
         //System.out.println(rR);
         //System.out.println(gG);
         //System.out.println(bB);
        
        
        // System.out.println("The red counter is " + counterR);
        // System.out.println("The green counter is " + counterG);
        // System.out.println("The blue counter is " + counterB);
        
        
        
        //System.out.println(redMod);
        // System.out.println(red);
        // System.out.println(green);
        // System.out.println(blue);
        
        
   	}
   	
}