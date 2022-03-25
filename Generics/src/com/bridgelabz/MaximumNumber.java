package com.bridgelabz;

public class MaximumNumber {
	public static Double findMaximumNumber(Double x, Double y, Double z) {
		Double max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
