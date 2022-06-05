package multiThreading;
class Counter {
    static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }
}
class Incrementer extends Thread {
    public void run() {
        for(int i=0; i<1000; i++) {
            Counter.increment();
        }
    }
}
public class SynchronisedKeywordTutorial {
    public static void main(String[] args) throws InterruptedException {
        // I want to increment counter by 2000 times
        Thread t1 = new Incrementer();
        Thread t2 = new Incrementer();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Counter value is " + Counter.counter);
    }
}