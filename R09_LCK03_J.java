package cis4615_HW2;

public class R09_LCK03_J {

	private final Lock lock = new ReentrantLock();
	 
	public void doSomething() {
	  synchronized(lock) {
		  // ...
	  }
	}
	
}
