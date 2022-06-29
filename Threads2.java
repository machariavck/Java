import java.util.*;

class ExampleThread implements Runnable {

	private Thread thread;
	private int counter;
	static boolean stop = true;

	ExampleThread(String s) {
		thread = new Thread(this, s);
		counter = 0;
	}

	//factory method
	static ExampleThread factoryExample(String n) {
		var th = new ExampleThread(n);
		th.thread.start();
		return th;
	}

	public void run() {
		while (counter < 10_000_000 && stop) {
			counter++;
		}
		stop = false;
	}

	Thread getThread() {
		return thread;
	}

	int getCount() {
		return counter;
	}
}

class Threads2 {

	public static void main(String[] sth) {
		threading();
	}

	static void threading() {
		var r = new Random();
		int n = 5;
		var t = new ExampleThread[n];
		for (int i = 0; i < n; i++) {
			t[i] = ExampleThread.factoryExample("#Child " + (i+1));
			//t[i].getThread().setPriority(r.nextInt(9) + 1);
			System.out.println("Priority for #Child " + (i+1) + ": " + t[i].getThread().getPriority());
		}
		System.out.println("\n\n");

		while (ExampleThread.stop) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error: " + e);
			}
		}

		for (var v : t) System.out.println(v.getThread().getName() + " has count " + v.getCount());
		System.out.println("\nMain method done");
	}
}