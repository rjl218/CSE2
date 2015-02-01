//Ryan Loftus
//hw02
//Arithmetic Class
//2/1/15

public class Arithmetic {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	
   	//Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;

    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;

    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
   	//calculations
   	double totalSockCost = nSocks * sockCost$;
   	double sockTax = taxPercent * totalSockCost;
   	
   	double totalGlassesCost= nGlasses * glassCost$;
   	double glassesTax = taxPercent*totalGlassesCost;
   	
   	double totalEnvelopesCost= nEnvelopes*envelopeCost$;
   	double envelopesTax= taxPercent*totalEnvelopesCost;
   	
   	double totalBeforeTax = totalEnvelopesCost+totalGlassesCost+totalSockCost;
   	
   	double totalTax = sockTax+glassesTax+envelopesTax;
   	
   	double afterTax = totalBeforeTax+totalTax;
   	
   	//conversions
   	sockTax = sockTax*100;
   	int sockTaxX = (int) sockTax;
   	sockTaxX= sockTaxX/100;
   	
   	glassesTax = glassesTax*100;
   	int glassesTaxX = (int) glassesTax;
   	glassesTaxX= glassesTaxX/100;
   	
   	envelopesTax = envelopesTax*100;
   	int envelopesTaxX = (int) envelopesTax;
   	envelopesTaxX= envelopesTaxX/100;
   	
   	
   	totalBeforeTax = totalBeforeTax*100;
   	int totalBeforeTaxX= (int) totalBeforeTax;
   	totalBeforeTaxX= totalBeforeTaxX/100;
   	
   	totalTax = totalTax*100;
   	int totalTaxX= (int) totalTax;
   	totalTaxX = totalTaxX/100;
   	
   	afterTax= afterTax*100;
   	int afterTaxX= (int) afterTax;
   	afterTaxX= afterTaxX/100;
   	
   	System.out.println("You bought " + nSocks + " socks at $" + sockCost$ + ".");
   	System.out.println("The total cost of socks was $" + totalSockCost +  " with an additional tax of $" + sockTaxX + ".");
   	
   	System.out.println("You bought " + nGlasses + " Glasses at $" + glassCost$ + ".");
   	System.out.println("The total cost of glasses was $" + totalGlassesCost +  " with an additional tax of $" + glassesTaxX + ".");
   
    System.out.println("You bought " + nEnvelopes + " envelopes at $" + envelopeCost$ + ".");
   	System.out.println("The total cost of envelopes was $" + totalEnvelopesCost +  " with an additional tax of $" + envelopesTaxX + ".");
   	
   	System.out.println("The transaction before tax was $" + totalBeforeTaxX + " with a total tax of $" + totalTaxX 
   	+ ". After tax the transaciton came to $" + afterTaxX + ".");
   	
   	
   	
   	}
   	
   	
   	}