/**
 * 
 */
package runnabletest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author June-Boat
 *
 */
public class DaemonFromClass implements Runnable{
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.print(Thread.currentThread()+" "+this);
			}
		}catch (InterruptedException e) {
			System.out.print("Interrupted");
		}
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for (int i = 0; i < 5; i++) 
			exec.execute(new DaemonFromClass());
		System.out.println("all started");
		TimeUnit.MILLISECONDS.sleep(500);
	}
}
