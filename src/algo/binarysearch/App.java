package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		// binary search only works on SORTED list.
		System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18},0, 7, 19));
	}
	
	/*
	 * my way
	 */
//	public static int binarySearch(int[] a, int x){
//		System.out.println("Starting Binary Search");
//		for(int i=0; i<a.length; i++){
//			System.out.print("[" + a[i] + "] ");
//		}
//		System.out.println("");
//		int p = 0;
//		int r = a.length-1;
//		
//		while(p <= r){
//			int q = (int) Math.floor((p+r)/2);	//center point
//			if(a[q] == x){
//				return q;
//			}
//			else if (a[q] > x){
//				r = q-1;
//				for(int i=0; i<r; i++){
//					System.out.print("[" + a[i] + "] ");
//				}
//				System.out.println("");
//			} else {
//				p = q+1;
//				for(int i=p; i<r; i++){
//					System.out.print("[" + a[i] + "] ");
//				}
//				System.out.println("");
//			}
//		}
//		return -1;
//	}
	
	/*
	 * instructor way
	 */
	public static int binarySearch(int[] a, int x){
		int p=0;
		int r = a.length-1;
		
		while(p <= r){
			int q = (p+r)/2;
			if(x < a[q]){
				r = q-1;
			}
			else if (x > a[q]){
				p = q+1;
			}
			else{
				return q;
			}
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] a, int p, int r, int x){
		System.out.println("[ " + p + "..." + r + " ]");
		if(p > r){	//base case
			return -1;
		}
		else {
			int q =(int) Math.ceil((p+r)/2);
			if(x == a[q]){
				return q;
			}
			else if (x < a[q]){	//x is in the left side of array
				return recursiveBinarySearch(a, p, q-1, x);
			}
			else{	// x is in the right side of array
				return recursiveBinarySearch(a, q+1, r, x);
			}
		}
	}
	
	
	
	
	
	
	
	
	

}
