package telran.multithreading;

import java.time.format.DateTimeFormatter;

public class TimerControllerAppl {

		public static void main(String[] args) throws InterruptedException {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			Timer timer = new Timer(formatter,1000);
			timer.start();
			Thread.sleep(5000);
			timer.interrupt();
			Thread.sleep(5000);
			//DONE
			//figure out a solution allowing timer stop
			//as example in 5 seconds you stop the timer
			//following 5 seconds application is running with no timer

		}

	}