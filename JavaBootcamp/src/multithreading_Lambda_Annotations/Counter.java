package multithreading_Lambda_Annotations;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter implements Runnable {

	   private static int counter = 1;

	  public static void main(String[] args) {
	       ExecutorService executorService = Executors.newFixedThreadPool(5);
	       for (int i = 0; i < 5; i++) {
	           executorService.submit(new Counter());
	       }
	       executorService.shutdown();
	   }

	   @Override
	   public void run() {
	       while (counter <= 100) {
	           increment();
	       }
	   }

	   private void increment() {
	       Object lock = 1;
		synchronized (lock) {
	           if(counter <= 100) {
	               System.out.println("Counter : " + counter);
	               counter++;
	           }
	       }
	   
	}
	}