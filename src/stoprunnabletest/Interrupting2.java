/**
 * 
 */
package stoprunnabletest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author June-Boat
 *p700 例题练习，可中断的互斥锁，通过lock.lockInterruptibly的方法实现
 */
class BlockedMutex{
	private Lock lock = new ReentrantLock();
	public BlockedMutex() {
		lock.lock();
	}
	public void f() {
		try {
			lock.lockInterruptibly();
			System.out.println("lock acquired in f()");
		}catch (InterruptedException e) {
			System.out.println("Interrupted from lock acquesition in f()");
		}
	}
}

class Blocked2 implements Runnable{
	BlockedMutex blocked=new BlockedMutex();
	public void run() {
		System.out.println("Waiting for f() in BlockedMutex");
		blocked.f();
		System.out.println("Broken out of blocked call");
	}
}

public class Interrupting2 {
	public static void main(String[] args) throws InterruptedException {
		Thread t= new Thread(new Blocked2());
		t.start();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Issuing t.interrupt()");
		t.interrupt();
	}
}
