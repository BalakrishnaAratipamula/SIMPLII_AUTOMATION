package Java_Examples;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Reverse_LinkedList_Custom {
	Node head;

	// Add node at end
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	// Print list
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Reverse list
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;

			prev = current;
			current = next;
		}

		head = prev;
	}

	public static void main(String[] args) {
		Reverse_LinkedList_Custom list = new Reverse_LinkedList_Custom();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println("Original List:");
		list.printList();

		System.out.println("Reversed List:");
		list.reverse();
		list.printList();
	}
}
