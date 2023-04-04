package com.glearning.assignment1.client;

import java.util.Scanner;

import com.glearning.assignment1.service.TransactionService;

public class Main {

	public static void main(String[] args) {
		TransactionService transactionservice = new TransactionService();
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the size of transaction array: ");
	     int size = sc.nextInt();
	     int[] transactions = new int[size];
	     System.out.print("Enter the values of array: ");
	     for (int i = 0; i < size; i++) {
	       transactions[i] = sc.nextInt();
	     }
	     System.out.print("Enter the total no of targets that needs to be achieved: ");
	     int numTargets = sc.nextInt();
	     for (int i = 0; i < numTargets; i++) {
	         System.out.print("Enter the value of target: ");
	         int target = sc.nextInt();
		     int transactionIndex = transactionservice.checkTransactionsTarget(transactions, target);
		     if(transactionIndex == -1) {
		    	 System.out.println("Given target is not achieved");
		     } 
		     else {
		    	 System.out.printf("Target achieved after %d transactions\n", transactionIndex);
		     }
	     }
	        sc.close();

	}

}
