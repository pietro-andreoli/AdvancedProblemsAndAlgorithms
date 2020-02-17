
public class Node {
	private Node next;
	private int data;

	public Node(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * Determines if this Node is considered a Head, meaning there is no value in the instance variable next.
	 * @return True if this Node is considered a head. False otherwise.
	 */
	public boolean isHead() {
		return this.next != null;
	}
	
}
