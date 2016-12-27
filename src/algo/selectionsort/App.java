package algo.selectionsort;

public class App {
	public static void main(String[] args){
		int[] myArray = new int[] {9,8,3,13,87,12,99};
		for(int i=0; i<myArray.length-1; ++i){
			System.out.print(" " + myArray[i]);
		}
		System.out.println(" ");
		selectionSort(myArray);
		for(int i=0; i<myArray.length; ++i){
			System.out.print(" " +myArray[i]);
		}
		
	}
	
	public static int[] selectionSort(int a[]){
		System.out.println("Starting Selection Sort");		
		for(int i=0; i<a.length-1; ++i){
			int minimum = i;
			//iterate the whole array except checked elements
			for(int j=i+1; j<a.length; ++j){
				//if a[j] is smaller than a[minimum], set minimum to j
				if(a[j] < a[minimum]){
					minimum = j;
				}
			}
			//swap a[i] with a[minimum]
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		return a;
	}
}
