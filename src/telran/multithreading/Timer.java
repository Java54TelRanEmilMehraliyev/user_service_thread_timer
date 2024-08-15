package telran.multithreading;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Timer extends Thread {
	//DONE displaying time in a given format and a given resolution
		//example displaying each second, or each 5 seconds, etc.
	private final DateTimeFormatter formatter;
	private final int resolution;
		
	public Timer(DateTimeFormatter formatter, int resolution) {
			setDaemon(true);
			this.formatter = formatter;
			this.resolution = resolution;
		}
		public void run() {
			while(true) {
				System.out.println(LocalTime.now().format(formatter));
				try {
					sleep(resolution);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					break;
				}
			}
		}
	}