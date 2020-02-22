
public class QuickSort extends Sort{
	
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	// [arrStart, arrEnd) Up to but does not include arrEnd.
	private void quickSort(int[] array, int arrStart, int arrEnd) {
		if (arrStart < arrEnd) {
			int pivot = array[arrStart];
			int smallPos = arrStart;
			for (int loopPos = arrStart + 1; loopPos <= arrEnd; loopPos++) {
				if (array[loopPos] <= pivot) {
					smallPos++;
					swap(array, loopPos, smallPos);
				}
			}
			
			swap(array, arrStart, smallPos);
			//TODO Figure out what is supposed to go in place of the 0. Should srrStart go there?
			
			quickSort(array, arrStart, smallPos);
			quickSort(array, smallPos + 1, arrEnd);
		}
		
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
