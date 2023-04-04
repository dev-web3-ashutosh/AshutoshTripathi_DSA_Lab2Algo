package com.glearning.assignment2.client;

import java.util.Arrays;
import java.util.Scanner;

import com.glearning.assignment2.service.CurrencyDenominations;

public class Main {

	public static void main(String[] args) {
		CurrencyDenominations currencydemo = new CurrencyDenominations();
		Scanner input = new Scanner(System.in);
		
		// Step 1: Get inputs
	    System.out.println("enter the size of currency denominations");
	    int n = input.nextInt();
	    int[] denominations = new int[n];
	    System.out.println("enter the currency denominations value");
	    for (int i = 0; i < n; i++) {
	        denominations[i] = input.nextInt();
	    }
	    System.out.println("enter the amount you want to pay");
	    int amount = input.nextInt();
	    
	   // Step 2: Sort denominations in decreasing order
	   Arrays.sort(denominations);
	   int[] sortedDenominations = new int[n];
	   for (int i = 0; i < n; i++) {
	       sortedDenominations[i] = denominations[n - i - 1];
	   }
	   currencydemo.payment(sortedDenominations, amount);
	   input.close();
	}

}
