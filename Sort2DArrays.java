/*
 * Laura Chevalier
 * Intro to Computer Science
 * Professor Versoza
 */
import java.util.Arrays;
public class Sort2DArrays {
	//sort a 2D array of integers
	public static void main(String[] args) {
		int[][] arr1 = {{7,7},{7,1},{1,2,3},{1,5},{1,2},{3,8},{3,8,1},{5}};
		int[][] arr2 = {{1,1},{1,2},{2},{2,4}};
		int[][] arr3 = {{7}};
		System.out.println("Array 1 unsorted: ");
		pprint(arr1);
		sort(arr1);
		System.out.println("Array 1 sorted: ");
		pprint(arr1);
		System.out.println("Array 2 unsorted: ");
		pprint(arr2);
		sort(arr2);
		System.out.println("Array 2 sorted: ");
		pprint(arr2);
		System.out.println("Array 3 unsorted: ");
		pprint(arr3);;
		sort(arr3);
		System.out.println("Array 3 sorted: ");
		pprint(arr3);
	}
	public static void sort(int[][] arr) {
		//Use selection sort to order arrays
		int[] temp;
		for (int k = 0; k < arr.length; k++) {
			int indexMinArray = k;
			for (int i = 0; i < arr.length; i++) {
				temp = new int[arr[i].length];
				if (arrayCompare(arr[indexMinArray], arr[i]) < 0) {
					indexMinArray = i;
				}
				if (indexMinArray != k) {
					temp = arr[indexMinArray];
					arr[indexMinArray] = arr[k];
					arr[k] = temp;
			}
			}
		}
	}
	public static int arrayCompare(int[] arr1, int[] arr2) {
		//compare two arrays based on numerical value
		//if values are the same but one array is longer,
		//the longer array is counted as bigger
		int comparison = 0;
		int shorterArray = Math.min(arr1.length, arr2.length);
		for (int i = 0; i < shorterArray; i++) {
			if (arr1[i] < arr2[i]) {
				comparison = -1; 
				break;
			} else if (arr2[i] < arr1[i]) {
				comparison = 1;
				break;
			} 
			if (arr2.length > arr1.length) {
				comparison = -1;
			}
		}
		return comparison;
	}
	public static void pprint(int[][] arr) {
		//print 2D array
			for (int[] iArr: arr) {
				System.out.print(Arrays.toString(iArr));
	}
			System.out.println();
}
}
