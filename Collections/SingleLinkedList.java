

class SingleLinkedList<E> {
	
	private static class Node<E> {
		private E element;
		private Node<E> next;

		Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		Node<E> getNext() {
			return next;
		}

		void setNext(Node<E> e) {
			next = e;
		}

		E getElement() {
			return element;
		}
	}

	private Node<E> head, tail;
	private int size;

	SingleLinkedList() {};

	void addFirst(E e) {
		head = new Node<>(e, head);
		if (tail == null) tail = head;
		size++;
	}

	void addLast(E e) {
		var temp = new Node<>(e, null);
		tail.setNext(temp);
		tail = temp;
		size++;
	}

	public String toString() {
		var s = "[ " + head.getElement();
		var current = head.getNext();
		while (current.getNext() != null) {
			s = s + " " + current.getElement();
			current = current.getNext();
		}
		return s + " " + current.getElement() + " ]";
	}

	void removeFirst() {
		head = head.getNext();
		size--;
	}

	int getSize() {
		return size;
	}


	public static void main(String... sth) {
		var list = new SingleLinkedList<String>();
		list.addFirst("Mango");
		list.addFirst("Banana");
		list.addFirst("Orange");
		list.addFirst("BlueBerry");
		list.addLast("Apple");

		System.out.println(list + "\nSize: " + list.getSize());

		list.removeFirst();
		list.removeFirst();
		System.out.println(list + "\nSize: " + list.getSize());

	}

}