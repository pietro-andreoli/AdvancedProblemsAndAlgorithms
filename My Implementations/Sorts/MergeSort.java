
public class MergeSort extends Sort{
	public void sort(int[] arr) {
		mergeSortV2(arr, 0, arr.length - 1);
	}
	
	private int[] mergeSortV1(int[] arr, int start, int end) {
		return null;
//		if (end <= start) return arr;
//		int aStart = start;
//		int bStart = (end - start + 1) / 2;
//		int aEnd = bStart - 1;
//		int bEnd = end;
//		
//		int[] unsortedArray = arr.clone();
//		mergeSort(unsortedArray, aStart, aEnd);
//		mergeSort(unsortedArray, bStart, bEnd);
//		
//		int aPos = aStart;
//		int bPos = bStart;
//		
//		for (int i = start; i < end; i++) {
//			if (aPos > bPos) {
//				// Swap
//				aPos ++;
//			}else if (aPos < bPos) {
//				// Swap
//				bPos ++;
//			}else {
//				// Add both
//				aPos ++;
//				bPos ++;
//				i ++;
//			}
//		}
		
		
		
		
	}
	
	private void mergeSortV2 (int[] arr, int start, int end) {
		if (end <= start) return;
		int aStart = start;
		int bStart = ((end - start + 1) / 2) + start;
		int aEnd = bStart - 1;
		int bEnd = end;
		
		mergeSortV2(arr, aStart, aEnd);
		mergeSortV2(arr, bStart, bEnd);
		
		int aPos = aStart;
		int bPos = bStart;
		
		int[] sortedArr = new int[end - start + 1];
		for (int i = start; i <= end; i++) {
			int sortedArrPos = i - start;
			if (aPos > aEnd) {
				sortedArr[sortedArrPos] = arr[bPos];
				bPos ++;
				continue;
			} else if (bPos > bEnd) {
				sortedArr[sortedArrPos] = arr[aPos];
				aPos ++;
				continue;
			}
			
			if (arr[aPos] < arr[bPos]) {
				sortedArr[sortedArrPos] = arr[aPos];
				aPos ++;
			}else if (arr[aPos] > arr[bPos]) {
				sortedArr[sortedArrPos] = arr[bPos];
				bPos ++;
			}else {
				sortedArr[sortedArrPos] = arr[aPos];
				i++;
				sortedArr[sortedArrPos + 1] = arr[bPos];
				aPos ++;
				bPos ++;
			}
		}
		for (int i = 0; i < sortedArr.length; i++) {
			arr[start + i] = sortedArr[i];
		}
	}
	
	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
