package multiThreading;

//Umashankar
class Hii extends Thread{
  public void run() {
      for(int i=0; i<5; i++) {
          System.out.println("Hi from thread " + Thread.currentThread().getName());
          try {
              sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

//Viswa Patel
class Helloo extends Thread{
  public void run() {
      for(int i=0; i<5; i++) {
          System.out.println("Hello");
          try {
              sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

public class MultiThreadingTutorial2 {
  public static void main(String[] args) throws InterruptedException {
      Thread t1 = new Hi();
      //Thread t2 = new Hello();
      Thread t3 = new Hi();

      t1.setName("UmaShankar");
      t1.setPriority(5);
      t3.setName("Prachi");
      t3.setPriority(10);

      t1.start();
      //t2.start();
      t3.start();

      t1.join();
      t3.join();

      System.out.println("Bye");
  }
}