package com.glearning.assignment1.service;

public class TransactionService {
	public int checkTransactionsTarget(int array[],int target) {
		int totalCount = 0;
		for(int i = 0; i < array.length; i++) {
			totalCount += array[i];
			if(totalCount >= target) {
				return i+1;
			}
			}
		return -1;
	}
}
