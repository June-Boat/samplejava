/**
 * 
 */
package runnabletest;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author June-Boat
 *
 */
class TimeSleep implements Callable<Integer>{
	private static Random rand=new Random(47);

	@Override
	public Integer call() throws Exception {//此处直接用run更好
		int ms = rand.nextInt(10); 
		TimeUnit.MILLISECONDS.sleep(ms);
		System.out.println(ms);
		return ms;
	}
	
}

public class MianThread {
	public static void main(String[] args) {
		LiftOff lo=new LiftOff();
		lo.run();
//		ExecutorService exec = Executors.newCachedThreadPool();
//		for (int i = 0; i < 5; i++) {
//			exec.submit(new TimeSleep());
//		}
//		exec.shutdown();
	}
}
