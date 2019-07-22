package com.sushanth.collections;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MaxPairwiseProduct {
    static BigInteger getMaxPairwiseProduct(int[] numbers) {
        int n = numbers.length - 1;
        int index = 0;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
        		if(numbers[i] > numbers[index]) {
        			index = i;
        		}
        }
		temp = numbers[n];
        numbers[n] = numbers[index];
        numbers[index] = temp;
		
        index = 0;
        temp = 0;
		for (int i = 1;i < n; i++) {
			if(numbers[i] > numbers[index]) {
				index = i;
			}
		}
		temp = numbers[n - 1];
        numbers[n - 1] = numbers[index];
        numbers[index] = temp;
		
		BigInteger lastButOne = BigInteger.valueOf(numbers[n-1]);
		
		BigInteger last = BigInteger.valueOf(numbers[n]);
		BigInteger result = lastButOne.multiply(last);
		return result;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}