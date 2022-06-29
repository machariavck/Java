
class ExampleThread extends Thread {

	ExampleThread(String s) {
		super(s);
	}

	static ExampleThread createAndStart(String s) {
		var t = new ExampleThread(s);
		t.start();
		return t;
	}

	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.print(getName() + " starting run " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error: " + e);
			}
			System.out.println("\n" + getName() + " ending run " + i);
		}
	}
}

class Threads {

	public static void main(String[] sth) {
		threading();
	}

	static void threading() {
		try {
			var t = ExampleThread.createAndStart("Child");
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
				Thread.sleep(300);
			}
			t.join();
		} catch (InterruptedException e) {
			System.out.println("Error: " + e);
		}
		System.out.println(Thread.currentThread().getName() + " thread ending..");
	}
}