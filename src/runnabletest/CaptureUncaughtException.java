/**
 * 
 */
package runnabletest;
import java.util.concurrent.*;
/**
 * @author June-Boat
 *
 */


class ExceptionThread2 implements Runnable{

	@Override
	public void run() {
		Thread t= Thread.currentThread(); 
		System.out.println("run() by "+t);
		System.out.println("eh= "+t.getUncaughtExceptionHandler());
		throw new RuntimeException();
	}
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

	/* (non-Javadoc)
	 * @see java.lang.Thread.UncaughtExceptionHandler#uncaughtException(java.lang.Thread, java.lang.Throwable)
	 */
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Caught "+e);
	}
	
}

class HandlerThreadFactory implements ThreadFactory{

	/* (non-Javadoc)
	 * @see java.util.concurrent.ThreadFactory#newThread(java.lang.Runnable)
	 */
	@Override
	public Thread newThread(Runnable r) {
		System.out.println(this+" creating new Thread");
		Thread t=new Thread(r);
		System.out.println("created "+t);
		t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println("eh= "+t.getUncaughtExceptionHandler());
		return t;
	}
	
}

public class CaptureUncaughtException {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
		exec.execute(new ExceptionThread2());
		exec.shutdown();
	}
}
