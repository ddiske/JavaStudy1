package com.root.app.study1.array;

import java.util.Random;

public class ArrayAlgorithm {
	//정렬 알고리즘

	public static void main(String[] args) {
		
Random random = new Random();
		
		int [] nums = new int [6];
		
		for(int i = 0; i < nums.length; i++) {
			// i = 0, 0
			// i = 1, 1
			// i = 2, 2
			// i = 5, 5
			
			nums[i] = random.nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
				
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
				
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
			
		
		//1.선택정렬
		int temp = 0;
		
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < i; j++) {
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		//2.삽입정렬
		for(int i = 0; i < nums.length; i++) {
			temp = nums[i];
			for(int j = i-1; j >=0; j--) {
				if (nums[j] > temp) {
					nums[j+1] = nums [j];
				}else {
					break;
				}
				nums[j+1] = temp;
			}
			
			
		}
		
		
		
		
		
	}	
}
