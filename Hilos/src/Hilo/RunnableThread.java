package Hilo;

import java.io.*;

public class RunnableThread {
    static PrintWriter out = new PrintWriter(System.out, true);

    public static void main (String args[]) {
		// first task: some pseudo-I/O operation
		RunnablePseudoIO pseudo = new RunnablePseudoIO(1000);
		Thread thread = new Thread (pseudo);
		
		RunnablePseudoIO pseudo1 = new RunnablePseudoIO(5000);
		Thread thread1 = new Thread (pseudo1);
		
		RunnablePseudoIO pseudo2 = new RunnablePseudoIO(10000);
		Thread thread2 = new Thread (pseudo2);
		
		RunnablePseudoIO pseudo3 = new RunnablePseudoIO(15000);
		Thread thread3 = new Thread (pseudo3);
		
		RunnablePseudoIO pseudo4 = new RunnablePseudoIO(20000);
		Thread thread4 = new Thread (pseudo4);
		
		RunnablePseudoIO pseudo5 = new RunnablePseudoIO(25000);
		Thread thread5 = new Thread (pseudo5);
		
		showElapsedTime("First call - 1 second");
		thread.start();
		showElapsedTime("Second call - 5 seconds");
		thread1.start();
		showElapsedTime("Third call - 10 seconds");
		thread2.start();
		showElapsedTime("Fourth call - 15 seconds");
		thread3.start();
		showElapsedTime("Fifth call - 20 seconds");
		thread4.start();
		showElapsedTime("Sixth call - 25 seconds");
		thread5.start();

		
    }

    static long baseTime = System.currentTimeMillis();

    // show the time elapsed since the program started
    static void showElapsedTime(String message) {
		long elapsedTime = System.currentTimeMillis() -baseTime;
		out.println(message + " at " + (elapsedTime/1000.0) + " seconds");
    }
}

// pseudo I/O operation run in a separate thread
class RunnablePseudoIO implements Runnable {
    int data = -1;
    long sleepTime;
    RunnablePseudoIO(long sleepTime) {  // constructor
    	super();
    	this.sleepTime = sleepTime;
    	RunnableThread.showElapsedTime("RunnablePseudoIO created");
    }

    @Override
    public void run() {
		RunnableThread.showElapsedTime("RunnablePseudoIO starts");
		try {
		    Thread.sleep(sleepTime);  // Time the thread will take
		    data = 999;		// data ready
		    RunnableThread.showElapsedTime("RunnablePseudoIO finishes");
		} catch (InterruptedException e) {}
    }
}