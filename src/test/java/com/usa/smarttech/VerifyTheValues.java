package com.usa.smarttech;

public class VerifyTheValues {

	// How do you verify the expected results
	// By java if else condition
	public static void main(String[] args) {
		// Fahim want to sale more than $195
		// Fahim want to buy less than $195
		int teslaPrice = 195;

		if (teslaPrice > 195) {
			System.out.println("Fahim sale his stocks");
		} else if (teslaPrice < 195) {
			System.out.println("Fahim buy the stocks");
		} else if (teslaPrice == 195) {
			System.out.println("Fahim want to sale his stock by buying price");
		} else {
			System.out.println("Didn't buy or sale any stocks");

		}
	}
}
