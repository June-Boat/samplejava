/**
 * 
 */
package stoprunnabletest;

import static net.mindview.util.Print.*;

import java.util.concurrent.TimeUnit;

/**
 * @author June-Boat
 *
 */
class NeedsCleanup {
	private final int id;

	public NeedsCleanup(int id) {
		this.id = id;
	}

	public void cleanup() {
		print("Cleaning up" + id);
	}
}

class Blocked3 implements Runnable {
	private volatile double d = 0.0;

	public void run() {
		try {
			while (!Thread.interrupted()) {
				NeedsCleanup n1 = new NeedsCleanup(1);
				try {
					print("Sleeping");
					TimeUnit.SECONDS.sleep(1);
					NeedsCleanup n2 = new NeedsCleanup(2);
					try {
						print("Calculating");
						for (int i = 0; i < 2500000; i++) {
							d = d + (Math.PI + Math.E) / d;
						}
						print("Finished time-consuming operation");
					} finally {
						n2.cleanup();
					}
				} finally {
					n1.cleanup();
				}
			}//while-end;
			print("Exiting via while() test");
		} catch (InterruptedException e) {
			print("Exiting via Interruption");
		}
	}
}

public class InterruptingIdiom {
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new Blocked3());
		t.start();
		TimeUnit.MILLISECONDS.sleep(10);//在执行sleep之前或之中，会在任务试图调用阻塞操作之前，经由InterruptedException退出
//		TimeUnit.MILLISECONDS.sleep(1010);//执行sleep后收到中断信号，通过while判断中断信号来退出
		t.interrupt();
	}
}
