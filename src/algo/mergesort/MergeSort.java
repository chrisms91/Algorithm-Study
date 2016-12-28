package algo.mergesort;

public class MergeSort {
	
	public static void sort(int inputArray[]){
		sort(inputArray, 0, inputArray.length-1);
	}
	
	public static void sort(int inputArray[], int start, int end){
		if(start >= end) {
			return; // finished traversing the array
		}
		
		int mid = (start + end)/2;
		sort(inputArray, start, mid);
		sort(inputArray, mid+1, end);
		merge(inputArray, start, mid, end);
	}
	
	public static void merge(int[] inputArray, int start, int mid, int end){
		
		int[] tempArray = new int[end - start +1];
		
		//iterate through the left-side of array
		int leftIndex = start;
		//iterate through the right-side of array
		int rightIndex = mid+1;
		//iterate through the tempArray
		int k = 0;
		
		while(leftIndex <= mid && rightIndex <=end){
			if(inputArray[leftIndex] < inputArray[rightIndex]){
				tempArray[k] = inputArray[leftIndex];
				++leftIndex;
			} else {
				tempArray[k] = inputArray[rightIndex];
				++rightIndex;
			}
			++k;
		}
		
		//double check left and right, and pick up the left elements to put it in the tempArray
		if(leftIndex <= mid){
			while(leftIndex <= mid){
				tempArray[k] = inputArray[leftIndex];
				++leftIndex;
				++k;
			}
		}
		else if(rightIndex <= end){
			while(rightIndex <= end){
				tempArray[k] = inputArray[rightIndex];
				++rightIndex;
				++k;
			}
		}
		
		//copy the sorted tempArray into inputArray
		for(int i=0; i<tempArray.length; ++i){
			inputArray[start+i] = tempArray[i];
		}
	}
}
