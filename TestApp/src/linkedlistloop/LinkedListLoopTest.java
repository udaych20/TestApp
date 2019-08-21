package linkedlistloop;

public class LinkedListLoopTest {

	private static void cyclicCode() {
		LinkedList linkedList = new LinkedList();
		linkedList.appendIntoTail(new Node("101"));
		Node cycle = new Node("201");
		linkedList.appendIntoTail(cycle);
		linkedList.appendIntoTail(new Node("301"));
		linkedList.appendIntoTail(new Node("401"));
		linkedList.appendIntoTail(cycle);

		if (linkedList.isCyclic()) {
			System.out.println("Linked List is cyclic as it contains cycles or loop");
		} else {
			System.out.println("LinkedList is not cyclic, no loop or cycle found");
		}
	}

	public static void main(String[] args) {
		cyclicCode();
		nonCyclicCode();
	}

	private static void nonCyclicCode() {
		LinkedList linkedList = new LinkedList();
		linkedList.appendIntoTail(new Node("101"));
		linkedList.appendIntoTail(new Node("201"));
		linkedList.appendIntoTail(new Node("301"));
		linkedList.appendIntoTail(new Node("401"));
		System.out.println("Linked List : " + linkedList);

		if (linkedList.isCyclic()) {
			System.out.println("Linked List is cyclic as it contains cycles or loop");
		} else {
			System.out.println("LinkedList is not cyclic, no loop or cycle found");
		}
	}
}
