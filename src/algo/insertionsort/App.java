package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		
		int[] myArray = new int[] {9,8,899,110,8,87,537,8,3,13,87,12,99};
		insertionSort(myArray);
		
		for(int i=0; i<myArray.length; ++i){
			System.out.print(" "+ myArray[i]);
		}
		
	}

	public static int[] insertionSort(int[] a){
		
		//i starts from 1 not 0 (assume first element is sorted)
		for(int i=1; i<a.length; ++i){
			// element variable contains the data we intend on brining over to the sorted area
			int current = a[i];
			// j variable points to the index position of the last value in the sorted area;
			int j = i-1;
			while(j>=0 && a[j]>current){
				a[j+1] = a[j];
				j -= 1;
			}
			a[j+1] = current;
		}
		return a;
	}
}
