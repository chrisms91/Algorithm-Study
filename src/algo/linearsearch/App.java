package algo.linearsearch;

import java.lang.reflect.Array;

public class App {

	public static void main(String[] args) {
		int[] array = {1, 3, 5, 22, 44, 9, 99, 392};
		
		linearSearch(array, 3922);
	}
	
//	public static int linearSearch(int[] a, int x){
//		
//		int answer = -1;
//		
//		for(int i=0; i<a.length; i++){
//			if(a[i]==x){
//				answer = i;
//				System.out.println("FOUND KEY AT [" + answer + ("] POSITION"));
//				return answer;
//			}
//		}
//		System.out.println("KEY IS NOT IN ARRAY, ANSWER: " + answer);
//		return answer;	
//	}
	
	// ******** O(n) **********
	
	public static int linearSearch(int[] a, int x){	
		for(int i=0; i<a.length; i++){
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}

}
