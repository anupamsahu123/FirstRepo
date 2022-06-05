package multiThreading;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String taskName;
    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");

        System.out.println("Initialising the task " + taskName + " at " + ft.format(d));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=0; i<5; i++) {
            d = new Date();
            System.out.println("Execution time for the task " + taskName + " at " + ft.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class ThreadPoolExecutorServiceTutorial {
    public static void main(String[] args) {
        Runnable r1 = new Task("Task1");
        Runnable r2 = new Task("Task2");
        Runnable r3 = new Task("Task3");
        Runnable r4 = new Task("Task4");
        Runnable r5 = new Task("Task5");

        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();
    }
}
