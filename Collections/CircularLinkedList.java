
class CircularLinkedList<T> {

	private static class Node<E> {

		private E element;
		private Node<E> next;

		Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		E getElement() {
			return element;
		}

		Node<E> getNext() {
			return next;
		}

		void setNext(Node<E> n) {
			next = n;
		}
	}

	private int size;
	private Node<T> tail;

	CircularLinkedList() {}

	T first() {
		if (size == 0) return null;
		return tail.getNext().getElement();
	}

	T last() {
		if (size == 0) return null;
		return tail.getElement();
	}

	void addFirst(T t) {
		if (size == 0) {
			tail = new Node<>(t, null);
			tail.setNext(tail);
		}
		else {
			var n = new Node<T>(t, tail.getNext());
			tail.setNext(n);
		}
		size++;
	}

	void addLast(T t) {
		addFirst(t);
		tail = tail.getNext();
	}

	T removeFirst() {
		if (size == 0) return null;
		var n = tail.getNext();
		if (n == tail) tail = null;
		else tail.setNext(n.getNext());
		size--;
		return n.getElement();
	}

	void rotate() {
		if (size > 1) tail = tail.getNext();
	}

	int size() {
		return size;
	}

	public String toString() {
		var s = "[ ";
		var n = tail;
		for (int i = 0; i < size; i++) {
			n = n.getNext();
			s += n.getElement() + ", ";
		}
		return s + "]";
	}

	public static void main(String... sth) {
		long startTime = System.currentTimeMillis();
		var list = new CircularLinkedList<String>();
		list.addFirst("Mango");
		list.addFirst("Banana");
		list.addFirst("Orange");
		list.addFirst("BlueBerry");
		list.addLast("Apple");
		list.rotate();

		System.out.println(list + "\nSize: " + list.size());

		list.removeFirst();
		list.removeFirst();
		System.out.println(list + "\nSize: " + list.size());
		long endTime = System.currentTimeMillis();

		long elapsed = startTime - endTime;
		System.out.println("Elapsed time: " + elapsed);

	}
}