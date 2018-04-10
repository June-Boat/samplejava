/**
 * 
 */
package runnabletest;
import static net.mindview.util.Print.*;

import java.util.concurrent.TimeUnit;
/**
 * @author June-Boat
 *
 */
class DaemonSpawn implements Runnable{
	@Override
	public void run() {
		while(true)
			Thread.yield();
	}
	
}

class Daemon implements Runnable{
	private Thread[] t= new Thread[10];

	@Override
	public void run() {
		for (int i = 0; i < t.length; i++) {
			t[i]=new Thread(new DaemonSpawn());
			t[i].setDaemon(true);
			t[i].start();
		}
		for (int i = 0; i < t.length; i++) {
			printnb("t["+i+"].isDaemon() = "+t[i].isDaemon()+",");
		}
		while(true)
			Thread.yield();
	}
}

public class Daemons{
	public static void main(String[] args) throws Exception {
		Thread t= new Thread(new Daemon());
		t.setDaemon(true);
		t.start();
		printnb("main t.isDaemon()="+t.isDaemon()+",");
		TimeUnit.SECONDS.sleep(1);
	}
}
