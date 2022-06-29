

class DoubleLinkedList<E> implements Cloneable {

	private static class Node<N> {

		Node<N> next;
		N element;
		Node<N> prev;

		Node() {}

		Node<N> getNext() {
			return next;
		}

		Node<N> getPrev() {
			return prev;
		}

		N getElement() {
			return element;
		}

		void setNext(Node<N> h) {
			next = h;
		}

		void setPrev(Node<N> t) {
			prev = t;
		}

		void setElement(N el) {
			element = el;
		}
	}

	private Node<E> head;
	private Node<E> tail;
	private int size;

	DoubleLinkedList() {
		head = new Node<E>();
		tail = new Node<E>();
		head.setNext(tail);
		tail.setPrev(head);
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return size == 0;
	}

	E first() {
		return head.getNext().getElement();
	}

	E last() {
		return tail.getPrev().getElement();
	}

	void addFirst(E el) {
		var todo = new Node<E>();
		var temp = head.getNext();
		// fix head
		head.setNext(todo);

		// fix todo
		todo.setPrev(head);
		todo.setElement(el);
		todo.setNext(temp);

		// fix temp
		temp.setPrev(todo);
		size++;
	}

	void addLast(E el) {
		var todo = new Node<E>();
		var temp = tail.getPrev();

		// fix tail
		tail.setPrev(todo);

		// fix todo
		todo.setNext(tail);
		todo.setElement(el);
		todo.setPrev(temp);

		// fix temp
		temp.setNext(todo);
		size++;
	}

	E removeFirst() {
		if (size == 0) return null;
		var n = head.getNext();
		n.getNext().setPrev(head);
		head.setNext(n.getNext());
		size--;
		return n.getElement();
	}

	E removeLast() {
		if (size == 0) return null;
		var n = tail.getPrev();
		n.getPrev().setNext(tail);
		tail.setPrev(n.getPrev());
		size--;
		return n.getElement();
	}

	public String toString() {
		if (size == 0) return null;
		var s = new StringBuilder();
		var n = head.getNext();
		while (n.getNext() != null) {
			s.append(n.getElement() + ", ");
			n = n.getNext();
		}
		return s.delete(s.length()-2, s.length()-1).toString();
	}

	protected DoubleLinkedList<E> clone() {
		var clone = new DoubleLinkedList<E>();
		clone.size = size;
		var next = head.getNext();

		while (next.getNext() != null) {
			clone.addLast(next.getElement());
			next = next.getNext();
		}

		return clone;
	}

	public static void main(String... sth) {
		var list = new DoubleLinkedList<String>();
		list.addLast("second book");
		list.addLast("third book");
		list.addFirst("first book");
		list.addFirst("zero book");

		System.out.println("Removed " + list.removeFirst());
		System.out.println("Removed " + list.removeLast());

		assert list.size() == 3	: "size was actually working properly";
		System.out.println(list);
	}

}

/*
	size();
	isEmpty();
	first(): E
	last(): E
	addFirst(e): void
	addLast(e): void
	removeFirst(): E
	removeLast(): E
	clone(): DoubleLinkedList<E>
*/