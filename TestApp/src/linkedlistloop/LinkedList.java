/**
 *
 */
package linkedlistloop;

/**
 * @author Uday
 *
 */
public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = new Node("head");
	}

	public void appendIntoTail(Node node) {
		Node current = head;
		while (current.next() != null) {
			current = current.next();
		}
		current.setNext(node);
	}

	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next() != null) {
			fast = fast.next().next();
			slow = slow.next();

			if (fast == slow) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head.next();
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next();
		}
//		sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
		return sb.toString();
	}
}
