package com.sushanth.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimalDeviceUtilization {
	public static void main(String[] args) {
		int dc = 10;
		int[][] fgLst = { { 1, 3 }, { 2, 5 }, { 3, 7 }, { 4, 10 } };
		int[][] bgLst = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
		for (int[] ele : findOpPairs(dc, fgLst, bgLst))
			System.out.println(Arrays.toString(ele));
	}

	private static List<int[]> findOpPairs(int dc, int[][] fgLst, int[][] bgLst) {
		Map<Integer, List<int[]>> map = new HashMap<>();
		//check for diff between each pair
		//iterating and checking for each fgLst all bgLst Combinations
		for (int i = 0; i < fgLst.length; i++) {
			for (int j = 0; j < bgLst.length; j++) {
				int diff = dc - fgLst[i][1] - bgLst[j][1];
				//storing diff as key and their repective pairs(ids[0]) as values
				if (diff >= 0) {
					//if key already exists add this to the existing key
					List<int[]> lst = map.getOrDefault(diff, new ArrayList<>());
					lst.add(new int[] { fgLst[i][0], bgLst[j][0] });
					map.put(diff, lst);
				}
			}
		}
		// for diff zero return the values
		// in this case the values corresponding to zero make the most optimal pair
		for (int i = 0; i <= dc; i++) {
			if (map.containsKey(i))
				return map.get(i);
		}
		return new ArrayList<>();
	}
}
