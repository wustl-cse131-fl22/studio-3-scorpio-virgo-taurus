package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the range of n: ");
		int n = in.nextInt();
		double sqrtRange = Math.sqrt(n);
		int range = n - 1 ;
		int dRange = (int) Math.round(sqrtRange);
		int [] listRanges;
		int [] listDivisors;
		listRanges = new int [range];
		listDivisors = new int [((int) Math.sqrt(range))];
		
		//establishes list of numbers to check
		for (int i = 0; i < listRanges.length;i++) {
			listRanges[i]=i+2;
		}
		
		//establishes list of possible divisors
		for (int value = 0; value <= (dRange); value++) {
			listDivisors[value] = value + 1;
		}
		
		System.out.print(listRanges);
		System.out.print(listDivisors);
		
		
		
		//for (int value: listRanges) {
		//	if ((value%2 == 0) || (value == 2)) {
	//			if ((value%3 == 0) || (value == 2)) {
		//			if ((value))
				}
		//		
		//	}
				
			//System.out.println (value);
		//}
		
	
		
		
	}

//}
