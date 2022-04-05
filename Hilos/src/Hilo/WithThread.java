package Hilo;

import java.io.*;

public class WithThread {
    static PrintWriter out = new PrintWriter(System.out, true);

    public static void main (String args[]) {
		// first task: some pseudo-I/O operation
		ThreadedPseudoIO pseudo = new ThreadedPseudoIO(1000);
		ThreadedPseudoIO pseudo1 = new ThreadedPseudoIO(5000);
		ThreadedPseudoIO pseudo2 = new ThreadedPseudoIO(10000);
		ThreadedPseudoIO pseudo3 = new ThreadedPseudoIO(15000);
		ThreadedPseudoIO pseudo4 = new ThreadedPseudoIO(20000);
		ThreadedPseudoIO pseudo5 = new ThreadedPseudoIO(25000);
		
		
		
		showElapsedTime("First call - 1 second");
		pseudo.start();
		showElapsedTime("Second call - 5 seconds");
		pseudo1.start();
		showElapsedTime("Third call - 10 seconds");
		pseudo2.start();
		showElapsedTime("Fourth call - 15 seconds");
		pseudo3.start();
		showElapsedTime("Fifth call - 20 seconds");
		pseudo4.start();
		showElapsedTime("Sixth call - 25 seconds");
		pseudo5.start();
		
		
		
		showElapsedTime("Another task starts");
  }

    static long baseTime = System.currentTimeMillis();
    // show the time elapsed since the program started

    static void showElapsedTime(String message) {
		long elapsedTime = System.currentTimeMillis() -baseTime;
		out.println(message + " at " + (elapsedTime/1000.0) + " seconds");
    }
}

// pseudo I/O operation run in a separate thread
class ThreadedPseudoIO extends Thread {
    int data = -1;
    long sleepTime;
    
    ThreadedPseudoIO(long sleepTime) {  // constructor
    	WithThread.showElapsedTime("ThreadedPseudoIO created");
    	this.sleepTime = sleepTime;
    }
    
    @Override
    public void run () {
		WithThread.showElapsedTime("ThreadedPseudoIO starts");
			try {
			    sleep(sleepTime);  // 10 seconds
			    data = 999;		// data ready
			    WithThread.showElapsedTime("ThreadedPseudoIO finishes");
			} catch (InterruptedException e) {}
    }
}