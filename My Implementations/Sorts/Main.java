import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		// General test.
		int[] test1 = { 10, 80, 30, 90, 40, 50, 70 };
		int[] test2 = { 90, 48, 18, 10, 51};
		int[] test3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] test4 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] test5 = {};
		int[] test6 = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };		
		QuickSort qs = new QuickSort();
		MergeSort ms = new MergeSort();
		
//		compareSorts(qs, test6, "Test 6");
//		compareSorts(qs, test1, "Test 1");
//		compareSorts(qs, test2, "Test 2");
//		compareSorts(qs, test3, "Test 3");
//		compareSorts(qs, test4, "Test 4");
//		compareSorts(qs, test5, "Test 5");

		compareSorts(ms, test6, "Test 7");
		compareSorts(ms, test1, "Test 8");
		compareSorts(ms, test2, "Test 9");
		compareSorts(ms, test3, "Test 10");
		compareSorts(ms, test4, "Test 11");
		compareSorts(ms, test5, "Test 12");
		
		
	}
	
	public static void compareSorts(Sort qs, int[] arr, String testName) {
		int[] qsArr = arr.clone();
		int[] sortArr = arr.clone();
		qs.sort(qsArr);
		Arrays.sort(sortArr);
		boolean result = assertEqual(qsArr, sortArr);
		System.out.printf("%s resulted %b.\n\tqs: %s\n\tSort: %s\n", testName, result    , Arrays.toString(qsArr), Arrays.toString(sortArr));
	}
	
	public static boolean assertEqual(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) return false;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) return false;
		}
		return true;
	}
}
