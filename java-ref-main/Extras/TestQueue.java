
interface IQueue<T> {
	void put(T ob);
	T get() throws Exception;
}


class LinearQueue<T> implements IQueue<T> {

	private T[] t;
	private int putLock, getLock;

	LinearQueue(T[] ob) {
		t = ob;
		putLock = getLock = 0;
	}

	public void put(T ob) {
		if (putLock == t.length) {
			System.out.println("Linear queue is full");
			return;
		}
		t[putLock++] = ob;
	}

	public T get() throws Exception{
		if (getLock == putLock) {
			throw new Exception("\nLinear queue now empty!\n");
		}
		return t[getLock++];
	}
}

class CircularQueue<T> implements IQueue<T> {

	private T[] t;
	private int putLock, getLock;
	private boolean lock = false;

	CircularQueue(T[] ob) {
		t = ob;
		putLock = getLock = 0;
	}

	public void put(T ob) {
		if (putLock == t.length) {
			putLock = 0;
		}
		lock = false;
		t[putLock++] = ob;
		if (t[t.length - 1] != null && t.length > 1)
			getLock = putLock;
	}

	public T get() throws Exception {

		if (lock) throw new Exception("\n\nCircular Queue is empty");

		if (getLock == putLock-1 || t[0] == null) {
			lock = true;
			return t[getLock++];
		}
		if (getLock == t.length) getLock = 0;
		return t[getLock++];
	}

	public void reset() {
		for (var r : t) r = null;
	}
}


public class TestQueue {
	
	public static void main(String[] sth) {
		//testLinearQueue();
		testCircularQueue();
	}

	static void testCircularQueue() {
		var lqObj = new CircularQueue<String>(new String[2]);

		System.out.println("\nPutting items in the array");
		for (int i = 0; i < 10; i++) {
			lqObj.put("String " + i);
			System.out.println("String " + i + " put.");
		}

		System.out.println("\n\nDone putting. Now retrieve.\n");
		try {
			for (;;) System.out.print("*" + lqObj.get() + "* ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}

	static void testLinearQueue() {
		var lqObj = new LinearQueue<Integer>(new Integer[10]);

		System.out.println("\nPutting items in the array");
		for (int i = 0; i < 12; i++)
			lqObj.put(i*2);

		System.out.println("Done putting. Now retrieve.\n\n");
		try {
			for (;;) System.out.print("*" + lqObj.get() + "* ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
}
