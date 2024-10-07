package cis4615_HW2;

public class R11_TPS03_J {

	final class PoolService {
		private final ExecutorService pool = Executors.newFixedThreadPool(10);
		 
		public void doSomething() {
			pool.execute(new Task());
		}
	}
		 
		final class Task implements Runnable {
			@Override public void run() {
				// ...
				throw new NullPointerException();
				// ...
		    }
		}
	
}
