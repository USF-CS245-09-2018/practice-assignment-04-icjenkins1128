
import java.util.Arrays;

public class SelectionSort implements SortingAlgorithm {

//	public static void main(String[] args) {
//		int[] someArray = {52, 5, 3, 10, 9};
//		sort(someArray);
//		System.out.println(Arrays.toString(someArray));
//		
//	}

	public void sort(int[] arr) {

		//runs the helper method for the selection sort
        selectionSort(arr);

	}

	public void selectionSort(int[] a) {

			for(int i = 0; i < a.length - 1; i++){

					swap(i, findMin(i, a), a);
		

			}

	}

	public int findMin(int pos, int[] arr){

		int min = pos;

		for(int k = pos + 1; k < arr.length; k++){

			if(arr[k] < arr[min]) {
				min = k;
			}

		}

		return min;
	}

	public void swap(int a, int b, int[] arr){

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

}