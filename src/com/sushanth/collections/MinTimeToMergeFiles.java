package com.sushanth.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinTimeToMergeFiles {
	static int minimumTime(int numOfSubFiles, List<Integer> files) {
	    PriorityQueue<Integer> mergeQueue = new PriorityQueue<>(files);

	    int time = 0;
	    while(mergeQueue.size() != 1) {
	        // merge always the smallest two files
	        int mergedFile = mergeQueue.poll() + mergeQueue.poll();
	        time += mergedFile;
	        mergeQueue.add(mergedFile);
	    }
	    return time;
	}
	
	public static void main(String[] args) {
		List<Integer> files = new ArrayList<Integer>();
		files.add(1);
		files.add(2);
		files.add(5);
		files.add(10);
		files.add(35);
		files.add(89);
		
		minimumTime(6,files);
	}

}
