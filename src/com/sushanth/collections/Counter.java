package com.sushanth.collections;

public class Counter {

	public long findNb(long m) {
		long n = 0;
		long sum = 0;
		while (true) {
			n += 1;
			sum += (long) Math.pow(n, 3);
			if (sum >= m) {
				break;
			}
		}
		if (sum == m) {
			return n;
		} else {
			return -1;
		}
	}
}