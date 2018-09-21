import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {

//	public static void main(String[] args) {
//		int[] someArray = {52, 5, 3, 10, 9};
//		sort(someArray);
//		System.out.println(Arrays.toString(someArray));
//		
//	}

	public void sort(int[] arr) {

		//runs the helper method for the bubble sort
        bubbleSort(arr);


	}

	public void bubbleSort(int[] a) {

		for(int k = 0; k < a.length - 1; k++){

			for(int i = 0; i < a.length - 1; i++){

				if(a[i] > a[i + 1]){

					swap(i, i + 1, a);


				}

			}

		}


	}

	public void swap(int a, int b, int[] arr){

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

		
		
	}

}