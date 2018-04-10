/**
 * 
 */
package runnabletest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author June-Boat
 *
 */
public class ExceptionThread implements Runnable{
	
	@Override
	public void run() {
		try {
			throw new RuntimeException();
		}catch (Exception e) {
			System.out.println("catch the exception");
		}finally {
			System.out.println("finally executing");
		}
		System.out.println("run end");
		
	}
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}
}
