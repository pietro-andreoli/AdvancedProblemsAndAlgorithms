import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a linked list that tracks order using a reference to the next Node.
 * @author Pietro Andreoli
 *
 */
public class LeftLinkedList implements LinkedList{

	private Node tail;
	
	/**
	 * Adds a value to the end of the Linked List.
	 * @param value The value to add to the end of the Linked List.
	 */
	@Override
	public void add(int value) {
		Node newNode = new Node(value);
		if (tail == null) tail = newNode;
		else {
			newNode.setNext(tail);
			tail = newNode;
		}
		
	}

	/**
	 * Searches the Linked List for the first value that matches the inputted value and removes it.
	 * 
	 * Time Complexity: O(n) Where n is the number of Nodes in the Linked List.
	 * 
	 * @param value The value to remove from the Linked List.
	 * @return The value of the removed Node. -1 if the value was not found.
	 */
	@Override
	public int remove(int value) {
		Node curr = tail;
		Node prev = null;
		while (curr != null) {
			// If the current data is the value
			if (curr.getData() == value) {
				// If the reference to the previous is null, then we're at the tail. Set the tails next as the new tail.
				if (prev == null) tail = curr.getNext();
				else {
					prev.setNext(curr.getNext());
				}
				return value;
			}
			prev = curr;
			curr = curr.getNext();
		}
		return -1;
		
	}

	@Override
	public void exists(int value) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		Node curr = tail;
		while (curr != null) {
			values.add(curr.getData());
			curr = curr.getNext();
		}
		int[] arrValues = new int[values.size()];
		for (int i = values.size() - 1; i >= 0 ; i--) {
			int index = values.size() - i - 1;
			arrValues[index] = values.get(i).intValue();
		}
		return Arrays.toString(arrValues);
	}

	@Override
	public void addAll(int[] values) {
		for (int i = 0; i < values.length; i++) {
			this.add(values[i]);
		}
	}

}
