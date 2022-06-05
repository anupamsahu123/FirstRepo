package multiThreading;

//Umashankar
class Hi extends Thread{
  public void run() {
      for(int i=0; i<5; i++) {
          System.out.println("Hi");
          try {
              sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

//Viswa Patel
class Hello extends Thread{
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

public class MultiThreadingTutorial {
  public static void main(String[] args) throws InterruptedException {
      Thread t1 = new Hi();
      Thread t2 = new Hello();

      t1.start();
      t2.start();
  }
}