/**
 * 
 */
package runnabletest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author June-Boat
 *
 */
class MaxPriorityThreadFactory implements ThreadFactory{
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.MAX_PRIORITY);
		return t;
	}
}

class MinPriorityThreadFactory implements ThreadFactory{
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.MIN_PRIORITY);
		return t;
	}
}

public class SimplePriority implements Runnable{
	private int countDown=5;
	private volatile double d;
//	private int priority;
//	public SimplePriority(int priority) {
//		this.priority=priority;
//	}
	public String toString() {
		return Thread.currentThread()+": "+countDown;
	}
	@Override
	public void run() {
//		Thread.currentThread().setPriority(priority);
		while(true) {
			for (int i = 0; i < 100000; i++) {
				d+=(Math.PI+Math.E)/(double)i;
				if(i%1000==0)
					Thread.yield();
			}
			System.out.println(this);
			if(--countDown==0)return;
		}
	}
	
	public static void main(String[] args) {
//		ExecutorService exec = Executors.newCachedThreadPool();
//		for (int i = 0; i < 5; i++) {
//			exec.execute(new SimplePriority(Thread.MIN_PRIORITY));
//		}
//		exec.execute(new SimplePriority(Thread.MAX_PRIORITY));
//		exec.shutdown();
		ExecutorService maxexec= Executors.newCachedThreadPool(new MaxPriorityThreadFactory());
		ExecutorService minexec= Executors.newCachedThreadPool(new MinPriorityThreadFactory());
		for (int i = 0; i < 5; i++) {
			minexec.execute(new SimplePriority());
		}
		maxexec.execute(new SimplePriority());
		minexec.shutdown();maxexec.shutdown();
	}
}
