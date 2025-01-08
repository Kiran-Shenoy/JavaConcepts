package multiThreading;
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
   
       }
}

public class Extending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   MyThread t1 = new MyThread();
	        MyThread t2 = new MyThread();
	        
	        t1.start();
	        t2.start();
	  
	}

}
