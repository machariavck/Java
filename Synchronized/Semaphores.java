/*
	~ semaphores control access to a shared resource through the use of a counter
	~ if a counter is greater than zero, access is allowed; if it's zero, access is denied
	~ what the counter is counting are called 'permits' thus a thread must be granted a 'permit' to access a resource
	~ the Java Semaphore class has two constructors;
			Semaphore(int num)
			Semaphore(int num, boolean how)
	~ 'num' represents the initial permit count (hence the number of threads that can access a shared resource at any one time)
	~ 'how' ensures permit is granted in the order in which waiting threads requested access - when set to true
	~ to acquire a permit, the acquire() method is called, which takes two forms;
			void acquire() throws InterruptedException
			void acquire(int num) throws InterruptedException
	~  the first form acquires one permit, the second form acquires 'num' permits
	~ if a permit cannot be granted at the time of the call, the invoking thread suspends until the permit is available
	~ to release a permit, the release() method is called, which has two forms;
			void release();
			void release(int num);
	~ the first form releases one permit, the second form releases 'num' permits

*/

import java.util.concurrent.*;

class Semaphores {
	public static void main(String... sth) {
		Semaphore sem = new Semaphore(1);
		new Thread(new IncThread(sem, "A")).start();
		new Thread(new DecThread(sem, "B")).start();
	}
}

class SharedResource {
	static int count = 0;
}

class IncThread implements Runnable {
	String name;
	Semaphore sem;

	IncThread(Semaphore s, String n) {
		sem = s;
		name = n;
	}

	public void run() {
		System.out.println("Starting " + name);
		try {
			//Acquire a permit
			System.out.println(name + " is waiting for a permit");
			sem.acquire();
			System.out.println(name + " gets a permit.");

			//Now access shared resource
			for (int i = 0; i < 5; i++) {
				SharedResource.count++;
				System.out.println(name + ": " + SharedResource.count);
			}

			//Now, allow a context switch -- if possible
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		//Release permit
		System.out.println(name + " releases the permit.");
		sem.release();
	}
}

class DecThread implements Runnable {
	String name;
	Semaphore sem;

	DecThread(Semaphore s, String n) {
		sem = s;
		name = n;
	}

	public void run() {
		System.out.println("Starting " + name);
		try {
			//Acquire a permit
			System.out.println(name + " is waiting for a permit");
			sem.acquire();
			System.out.println(name + " gets a permit.");

			//Now access shared resource
			for (int i = 0; i < 5; i++) {
				SharedResource.count--;
				System.out.println(name + ": " + SharedResource.count);
			}

			//Now, allow a context switch -- if possible
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		//Release permit
		System.out.println(name + " releases the permit.");
		sem.release();
	}
}