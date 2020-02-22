
public class MergeSort extends Sort{
	public void sort(int[] arr) {
		
	}
	
	private int[] mergeSort(int[] arr, int start, int end) {
		if (end <= start) return arr;
		int aStart = start;
		int bStart = (end - start + 1) / 2;
		int aEnd = bStart - 1;
		int bEnd = end;
		
		int[] unsortedArray = arr.clone();
		mergeSort(unsortedArray, aStart, aEnd);
		mergeSort(unsortedArray, bStart, bEnd);
		
		int aPos = aStart;
		int bPos = bStart;
		
		for (int i = start; i < end; i++) {
			if (aPos > bPos) {
				// Swap
				aPos ++;
			}else if (aPos < bPos) {
				// Swap
				bPos ++;
			}else {
				// Add both
				aPos ++;
				bPos ++;
				i ++;
			}
		}
		
		
		
		
	}
	
	private void mergeSortV2 (int[] arr, int start, int end) {
		if (end <= start) return;
		int aStart = start;
		int bStart = (end - start + 1) / 2;
		int aEnd = bStart - 1;
		int bEnd = end;
		
		mergeSort(arr, aStart, aEnd);
		mergeSort(arr, bStart, bEnd);
		
		int aPos = aStart;
		int bPos = bStart;
		
		for (int i = start; i < end; i++) {
			if (aPos > bPos) {
				// Swap
				aPos ++;
			}else if (aPos < bPos) {
				// Swap
				bPos ++;
			}else {
				// Add both
				aPos ++;
				bPos ++;
				i ++;
			}
		}
	}
	
	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
