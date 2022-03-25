package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		
		Integer[] integerArray = { 12, 21, 23, 43, 85, 2, 45, 25, 88};
		Double[] doubleArray = { 12.0, 21.0, 23.0, 43.0, 85.0, 2.0, 45.0, 25.0, 88.0};
		String[] stringArray = { "Suman", "Virat", "Lion", "ETC"};

		new FindMaximum<Integer>(integerArray).maximum();
		new FindMaximum<Double>(doubleArray).maximum();
		new FindMaximum<String>(stringArray).maximum();
	}
}
