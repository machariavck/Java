
//TickTock Class
class TickTock {

	private static String state;

	synchronized void tick(boolean flag) {
		if (!flag) {
			state = "ticked";
			notify();
			return;
		}
		System.out.print("Tick ");
		state = "ticked";
		notify();
		while (state.equals("ticked")) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void tock(boolean flag) {
		if (!flag) {
			state = "tocked";
			notify();
			return;
		}
		System.out.println("Tock");
		state = "tocked";
		notify();
		while (state.equals("tocked")) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


//ExampleThread
class ExampleThread implements Runnable {

	private Thread thread;
	private static TickTock tt;
	private int tickNumber;

	ExampleThread(String s, int i) {
		thread = new Thread(this, s);
		tickNumber = i;
		tt = new TickTock();
	}

	static ExampleThread factoryExample(String n, int i) {
		var th = new ExampleThread(n, i);
		th.thread.start();
		return th;
	}

	public void run() {
		if (tickNumber == 1) {
			for (int i = 0; i < 10; i++) {
				tt.tick(true);
				tt.tick(false);
			}
		} else {
			for (int i = 0; i < 10; i++) {
				tt.tock(true);
				tt.tock(false);
			}
		}
	}

	Thread getThread() {
		return thread;
	}

}


//Main Class
class Threads3 {

	public static void main(String[] sth) {
		threading();
	}

	static void threading() {
		int n = 2;
		var t = new ExampleThread[n];
		for (int i = 0; i < n; i++) {
			t[i] = ExampleThread.factoryExample("#Child " + (i+1), i+1);
		}
		System.out.println();

		try {
			for (var v : t) v.getThread().join();
		} catch (InterruptedException e) {
			System.out.println("Error: " + e);
		}

		System.out.println("\nMain method done");
	}
}