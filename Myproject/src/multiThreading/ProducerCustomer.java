package multiThreading;
import java.io.*;

class Producers extends Thread {
    private PipedOutputStream pos;

    public Producers(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            pos.write("Hello from Producer!".getBytes());
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Consumers extends Thread {
    private PipedInputStream pis;

    public Consumers(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class ProducerCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        PipedInputStream pis = new PipedInputStream();
		        PipedOutputStream pos = new PipedOutputStream(pis);

		        Producers producer = new Producers(pos);
		        Consumers consumer = new Consumers(pis);

		        producer.start();
		        consumer.start();
		    }
}


