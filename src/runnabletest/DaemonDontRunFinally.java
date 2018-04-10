/**
 * 
 */
package runnabletest;

import java.util.concurrent.TimeUnit;

/**
 * @author June-Boat
 *
 */
class ADaemon implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Starting ADaemon");
//			TimeUnit.SECONDS.sleep(1);
			TimeUnit.MILLISECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("exiting via Interrupted");
		}finally {
			System.out.println("this is finally");
		}
	}
}

public class DaemonDontRunFinally {
	public static void main(String[] args) {
		Thread t=new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
	}
}
