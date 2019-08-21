/**
 *
 */
package linkedlistloop;

/**
 * @author Uday
 *
 */
public class Node {
	private Node next;
	private String data;

	public Node(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public Node next() {
		return next;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return data;
	}
}
