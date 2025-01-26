package interfaces;

//Define the Watch interface
interface Watch {
 void start();
 void stop();
 void displayTime();
}

//Implement the Watch interface in the AnalogWatch class
class AnalogWatch implements Watch {
 private boolean isRunning;

 @Override
 public void start() {
     isRunning = true;
     System.out.println("Analog watch started.");
 }

 @Override
 public void stop() {
     isRunning = false;
     System.out.println("Analog watch stopped.");
 }

 @Override
 public void displayTime() {
     if (isRunning) {
         System.out.println("Analog watch shows the current time.");
     } else {
         System.out.println("Analog watch is stopped. Please start it to display the time.");
     }
 }
}

//Implement the Watch interface in the DigitalWatch class
class DigitalWatch implements Watch {
 private boolean isRunning;

 @Override
 public void start() {
     isRunning = true;
     System.out.println("Digital watch started.");
 }

 @Override
 public void stop() {
     isRunning = false;
     System.out.println("Digital watch stopped.");
 }

 @Override
 public void displayTime() {
     if (isRunning) {
         System.out.println("Digital watch shows the current time.");
     } else {
         System.out.println("Digital watch is stopped. Please start it to display the time.");
     }
  }
}

public class Repair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Watch myAnalogWatch = new AnalogWatch();
	     Watch myDigitalWatch = new DigitalWatch();

	     // Test the AnalogWatch implementation
	     myAnalogWatch.start();
	     myAnalogWatch.displayTime();
	     myAnalogWatch.stop();
	     myAnalogWatch.displayTime();

	     // Test the DigitalWatch implementation
	     myDigitalWatch.start();
	     myDigitalWatch.displayTime();
	     myDigitalWatch.stop();
	     myDigitalWatch.displayTime();

	}

}
