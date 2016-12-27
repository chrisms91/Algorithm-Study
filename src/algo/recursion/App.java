package algo.recursion;

public class App {

	public static void main(String[] args) {
		int[] array = {1,2,3,5,6,44,6,77,898,231};
		System.out.println(recursiveLinearSearch(array, 0, 44));
	}

	public static void reduceByOne(int n){
		if(n>=0){	//base case!
			reduceByOne(n-1);
		}
		System.out.println("n: " + n);	//0, 1, 2, 3, 4, 5
	}
	
	//return index position
	public static int recursiveLinearSearch(int[] A, int i, int x){
		int n = A.length;
		
		if(i>n-1){	//if x is not found in the array
			return -1;
		}
		else if (A[i] == x){
			return i;
		}
		else{
			System.out.println("Index at: " + i);
			return recursiveLinearSearch(A, i+1, x);
		}
	}
}
