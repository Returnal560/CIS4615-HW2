package cis4615_HW2;

public class R10_THI00_J {

	public final class Foo implements Runnable {
		@Override public void run() {
			// ...
		}
		 
		 public static void main(String[] args) {
			 Foo foo = new Foo();
			 new Thread(foo).run();
		 }
	}
	
}
