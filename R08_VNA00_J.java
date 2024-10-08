package cis4615_HW2;

public class R08_VNA00_J {

	final class ControlledStop implements Runnable {
		private volatile boolean done = false;
		  
		@Override public void run() {
			while (!done) {
				try {
					// ...
					Thread.currentThread().sleep(1000); // Do something
		        } catch(InterruptedException ie) {
		        	Thread.currentThread().interrupt(); // Reset interrupted status
		        }
		    }   
		 }
		 
		 public void shutdown() {
			 done = true;
		 }
	}
	
}
