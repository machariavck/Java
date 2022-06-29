import java.util.concurrent.Semaphore;

class Synchronized {
	public static void main(String... sth) {
		Container c = new Container();
		new Thread(new Consumer(c), "Consumer").start();
		new Thread(new Producer(c), "Producer").start();
	}
}

class Container {
	private int v;
	static Semaphore g = new Semaphore(0);		// MOST IMPORTANT
	static Semaphore p = new Semaphore(1);
	
	void get() {
		try {
			g.acquire();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Get: " + v);
		p.release();
	}

	void put(int v) {
		try {
			p.acquire();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Put: " + v);
		this.v = v;
		g.release();
	}
}


class Producer implements Runnable {

	Container c;

	Producer(Container c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 10; c.put(i++));
	}
}

class Consumer implements Runnable {

	Container c;

	Consumer(Container c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 10; i++) c.get();
	}
}