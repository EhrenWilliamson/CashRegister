package makeChange;

import java.util.*;

public class MakeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much is the item?");
		double amountOfItem = input.nextDouble();
		System.out.println("How much money did the customer give you?");
		double tender = input.nextDouble();
		double money[] = { 10.00, 5.00, 1.0, .25, .10, .05, .01 };
		int tenDollars = 0;
		int fiveDollars = 0;
		int oneDollars = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		String addTenBill = " Ten dollar bill, ";
		String addTenBills = " Ten dollar bills, ";
		String addFiveBill = " Five dollar bill, ";
		String addFiveBills = " Five dollar bills, ";
		String addOneBill = " One dollar bill, ";
		String addOneBills = "One dollar bills, ";
		String addQuarter = " quarter, ";
		String addQuarters = " quarters,";
		String addDime = " dime, ";
		String addDimes = " dimes, ";
		String addNickels = " nickels, ";
		String addNickel = " nickel, ";
		String addPenny = " penny. ";
		String addPennies = " pennies. ";
		
		
		
		
		if (amountOfItem == tender) {
			System.out.println("Thank you, have a nice day!");
		}
		if (amountOfItem > tender) {
			System.out.println("Error");
		}
	
		
		if (tender > amountOfItem) {
			amountOfItem = tender - amountOfItem;
			while (!(amountOfItem == 0)) {
				if (amountOfItem >= 10.00) {
					amountOfItem =(double)Math.round((amountOfItem - money[0]) * 100.0) /100;
					tenDollars = tenDollars + 1;
					continue;
				}
				if (amountOfItem >= 5.00) {
					amountOfItem =(double)Math.round((amountOfItem - money[1]) * 100.0) /100;
					fiveDollars = fiveDollars + 1;
					continue;
				}
				if (amountOfItem >= 1.00) {

					amountOfItem =(double)Math.round((amountOfItem - money[2]) * 100.0) /100;
					oneDollars = oneDollars + 1;
					continue;
				}
				if (amountOfItem >= .25) {
					amountOfItem =(double)Math.round((amountOfItem - money[3]) * 100.0) /100;
					quarter = quarter + 1;
					continue;
				}
				if (amountOfItem >= .10) {
					amountOfItem = (double)Math.round((amountOfItem - money[4]) * 100.0) /100;
					dime = dime + 1;
					continue;
				}
				if (amountOfItem >= .05) {
					amountOfItem = (double)Math.round((amountOfItem - money[5]) * 100.0) /100;
					nickel = nickel + 1;
					continue;
				}
				if (amountOfItem >= .01) {
					amountOfItem = (double)Math.round((amountOfItem - money[6]) * 100.0) /100;
					penny = penny + 1;
					continue;
				}
				
				 }

			}

	      int counters [] = { tenDollars,fiveDollars,oneDollars,quarter,dime,nickel,penny};
	      		if ( counters [0] == 1){
	      			System.out.print(tenDollars + addTenBill);
	      		} 
	      		if ( counters [0] > 1)   {  
	      			System.out.print(tenDollars + addTenBills);
	      		}
	      		if ( counters [1] == 1){
	      			System.out.print(fiveDollars + addFiveBill);
	      		} 
	      		if ( counters [1] > 1)   {  
	      			System.out.print(fiveDollars + addFiveBills);
	      		}
	      		if ( counters [2] == 1){
	      			System.out.print(oneDollars + addOneBill);
	      		} 
	      		if ( counters [2] > 1)   {  
	      			System.out.print(oneDollars + addOneBills);
	      		}
	      		if ( counters [3] == 1){
	      			System.out.print(quarter + addQuarter);
	      		} 
	      		if ( counters [3] > 1)   {  
	      			System.out.print(quarter + addQuarters);
	      		}
	      		if ( counters [4] == 1){
	      			System.out.print(dime + addDime);
	      		} 
	      		if ( counters [4] > 1)   {  
	      			System.out.print(dime + addDimes);
	      		}
	      		if ( counters [5] == 1){
	      			System.out.print(nickel + addNickel);
	      		} 
	      		if ( counters [5] > 1)   {  
	      			System.out.print(nickel + addNickels);
	      		}
	      		if ( counters [6] == 1){
	      			System.out.print(penny + addPenny);
	      		} 
	      		if ( counters [6] > 1)   {  
	      			System.out.print(penny + addPennies);
	      		}
	}
	
}

