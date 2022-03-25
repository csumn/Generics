package com.bridgelabz;

public class Main {
	public static void main(String[] args) {

		Integer x = 98, y = 100, z = 500;
		int maxInt = new FindMaximum<Integer>(x, y, z).maximum();
		System.out.println("Maximum is : " + maxInt);		

		Double x1 = 598.0, y1 = 100.0, z1 = 500.0;
		double maxDouble = new FindMaximum<Double>(x1, y1, z1).maximum();
		System.out.println("Maximum is : " + maxDouble);	

		String x11 = "Suman", y11 = "Virat", z11 = "Developer";
		String maxString = new FindMaximum<String>(x11, y11, z11).maximum();
		System.out.println("Maximum is : " + maxString);	
	}
}
