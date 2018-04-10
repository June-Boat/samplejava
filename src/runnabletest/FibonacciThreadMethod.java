/**
 * 
 */
package runnabletest;

import static net.mindview.util.Print.print;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author June-Boat
 *
 */
public class FibonacciThreadMethod {
	private ExecutorService exec=Executors.newSingleThreadExecutor();
	public Future<Integer> runTask(int n) {
		return  exec.submit(new Fibonacci(n));
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FibonacciThreadMethod fib=new FibonacciThreadMethod();
		Random rand = new Random(47);
		ArrayList<Future<Integer>> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(fib.runTask(rand.nextInt(20)));
		}
		for (Future<Integer> future : list) {
			System.out.println(future.get());
		}
	}
}
