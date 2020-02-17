import java.util.Arrays;
import java.util.Random;

public class main {

	private static int valueMax = 50;
	
	public static void main(String[] args) {
		System.out.println("Start.");
		int[] values = generateValues(10);
		System.out.println(Arrays.toString(values));
		
		
		LeftLinkedList leftList = new LeftLinkedList();
		leftList.addAll(values);
		System.out.printf("LeftLinkedList - Contents: %s\n", leftList.toString());
		int rm = getRandomValue(values);
		System.out.printf("Removing %d\n", rm);
		leftList.remove(rm);
		System.out.printf("LeftLinkedList - Contents: %s\n", leftList.toString());
		
		rm = getRandomValue(values);
		System.out.printf("Removing %d\n", rm);
		leftList.remove(rm);
		System.out.printf("LeftLinkedList - Contents: %s\n", leftList.toString());
		
		rm = getRandomValue(values);
		System.out.printf("Removing %d\n", rm);
		leftList.remove(rm);
		System.out.printf("LeftLinkedList - Contents: %s\n", leftList.toString());
		
	}
	
	public static int[] generateValues(int numValues) {
		int[] output = new int[numValues];
		Random random = new Random();
		for (int i = 0; i < numValues; i++) {
			output[i] = random.nextInt(valueMax);
		}
		return output;
	}
	
	public static int getRandomValue(int[] values) {
		Random random = new Random();
		int rNum = random.nextInt(values.length);
		return values[rNum];
	}
	

}
