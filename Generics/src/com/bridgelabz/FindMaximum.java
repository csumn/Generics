package com.bridgelabz;

public class FindMaximum <T extends Comparable<T>>{
	T x, y, z;

	public FindMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return FindMaximum.maximumIs(x, y, z);
	}

	public static <T extends Comparable<T>> T maximumIs(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
