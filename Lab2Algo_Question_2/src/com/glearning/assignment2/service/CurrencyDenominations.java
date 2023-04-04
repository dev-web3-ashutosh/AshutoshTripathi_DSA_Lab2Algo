package com.glearning.assignment2.service;

import java.util.ArrayList;
import java.util.List;

public class CurrencyDenominations {
	public void payment(int[] sortedDenominations, int amount) {
		// Step 3: Use the highest denomination to pay the full amount
	    List<String> notesUsed = new ArrayList<>();
	    for (int d : sortedDenominations) {
	        if (amount >= d) {
	            int count = amount / d;
	            amount -= count * d;
	            notesUsed.add(d + ":" + count);
	        }
	        if (amount == 0) {
	            break;
	        }
	    }
	   
	    // Step 4: Print the notes used
	    System.out.println("Your payment approach in order to give min no of notes will be");
	    for (String note : notesUsed) {
	        System.out.println(note);
	    }
	}
}
