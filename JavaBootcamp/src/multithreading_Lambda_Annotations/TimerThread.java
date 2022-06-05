package multithreading_Lambda_Annotations;
import java.util.*;
import java.util.Scanner;

public class TimerThread {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int times = scanner.nextInt();
	        TimeClock timer = new TimeClock(times);
	        Thread timerThread = new Thread(timer);
	        timerThread.start();
	    }
	}
	class TimeClock implements Runnable {
	   int times = 0;
	    TimeClock(int n){
	        times = n;
	    }
	    int count = 0;
	    @Override
	    public void run() {
	        try {
	            while(count<times) {
	                printCurrentTime(count+1);
	                count++;
	      
	Thread.sleep(100);
	            }
	        }
	catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    void printCurrentTime(int number){
	        System.out.println("PrintingTime-"+number);
	    }
}