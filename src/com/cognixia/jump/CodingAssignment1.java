package com.cognixia.jump;

public class CodingAssignment1 {
	//write a method called toMilesPerHour that has 1 parameter of type double with 
	//the name kilometersperhour. this method needs to return the rounded value of the calculation
	//of the calculation of type long
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		}
		return Math.round(kilometersPerHour/1.609);
	}
}
