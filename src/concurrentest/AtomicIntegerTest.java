/**
 * 
 */
package concurrentest;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author June-Boat
 *p684 用原子类改写AtomicityTest，不过一般还是用锁来控制同步
 */
public class AtomicIntegerTest implements Runnable{
	private AtomicInteger i =new AtomicInteger(0);
	public  int getValue() {
		System.out.println("getValue(): "+i.get());
		return i.get();
	}
	private void evenIncrement() {
		i.addAndGet(2);
	}
	@Override
	public void run() {
		while(true){
			evenIncrement();
		}
	}
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.err.println("Aborting");
				System.exit(0);
			}
		}, 5000);
		ExecutorService exec =Executors.newCachedThreadPool();
		AtomicIntegerTest ait=new AtomicIntegerTest();
		exec.execute(ait);
		while(true) {
			int val=ait.getValue();
			if(val%2!=0) {
				System.out.println("ifval: "+val);
				System.exit(0);
			}
		}
	}
}	
