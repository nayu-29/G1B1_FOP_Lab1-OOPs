package com.greatlearning.iitr.dsa.labsession2;

public class NoteCount {

	public void counting(int[] currency, int amount) {

		int noteCount[] = new int[currency.length];
		int i;
		int sumofnotes = 0;
		for (i = 0; i < currency.length; i++) {
			noteCount[i] = amount / currency[i];
			amount = amount % currency[i];
			sumofnotes += noteCount[i];
		}
        System.out.println("Your payment approach in order to give min no of notes will be:");
		for (i = 0; i < currency.length; i++) {
			if (noteCount[i] != 0) {
				System.out.println(currency[i] + "X" + noteCount[i]);
			}
		}

		System.out.println("Total Notes " + sumofnotes);
	}
}
