package com.jerrycook.bubble;

public class BubbleMain {

	public static void main(String[] args) {
		
		int[] intArray= {10,30,50,40,20};
		bubbleSort(intArray);
		printArray(intArray);
		reverseBubbleSort(intArray);
		printArray(intArray);

	}
	
	//ascending
	public static void bubbleSort(int[] intArray) {
		
		for(int unsortedIndex = intArray.length-1;unsortedIndex > 0;unsortedIndex --) {
			for(int i = 0; i < intArray.length-1;i++) {
				if(intArray[i] > intArray[i+1])
				{
					swap(intArray, i, i+1);
				}
			}
		}
	}
	
	//descending
	public static void reverseBubbleSort(int[] intArray) {
		for(int unsortedIndex = intArray.length-1; unsortedIndex > 0; unsortedIndex --) {
			
			for(int i = 0; i < intArray.length-1; i++) {
				if(intArray[i] < intArray[i+1]) {
					swap(intArray, i,i+1);
				}
			}
		}
	}
	public static void swap (int[] intArray, int position1, int position2) {
		int temp = intArray[position1];
		intArray[position1] = intArray[position2];
		intArray[position2] = temp;
		
	}
	
	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length;i++) {
			System.out.print(intArray[i]+"  ");
		}
		System.out.println("\n");
	}


}
