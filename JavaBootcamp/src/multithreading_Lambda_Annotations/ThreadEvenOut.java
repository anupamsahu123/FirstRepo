package multithreading_Lambda_Annotations;

public class ThreadEvenOut {
	
	 static int counter = 1;
	 boolean odd;
	int MAX = 100;

	public void printOddNumber() {
		synchronized (this) {
			while (counter < MAX) {
				//System.out.println("Checking odd loop");

				while (!odd) {
					try {
					//	System.out.println("Odd waiting : " + counter);
						wait();
						//System.out.println("Notified odd :" + counter);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(counter);
				counter++;
				odd = false;
				notify();
			}
		}
	}

	   public void printEvenNumber() {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			synchronized (this) {
				while (counter < MAX) {
					//System.out.println("Checking even loop");

					while (odd) {
						try {
						//	System.out.println("Even waiting: " + counter);
							wait();
							//System.out.println("Notified even:" + counter);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(counter);
					counter++;
					odd = true;
					notify();

				}
			}
		}

	public static void main(String[] args)
	   {
		ThreadEvenOut oep = new ThreadEvenOut();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printEvenNumber();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printOddNumber();

			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} }

}
