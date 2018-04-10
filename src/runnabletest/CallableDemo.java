/**
 * 
 */
package runnabletest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author June-Boat
 *
 */
class Fibonacci implements Callable<Integer>{
	private int n;
	public Fibonacci(int n) {
		this.n=n;
	}
	private int fib(int n) {
		if(n<2)return 1;
		return fib(n-1)+fib(n-2);
	}

	@Override
	public Integer call() throws Exception {
		return fib(n);
	}
	
}


class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id) {
		this.id=id;
	}
	
	
	@Override
	public String call() throws Exception {
		return "result of TaskWithResult "+id;
	}
	
}

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		/*ArrayList<Future<String>> result =new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			result.add(exec.submit(new TaskWithResult(j)));
		}
		for (Future<String> future : result) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				System.out.println(e);
			}finally {
				exec.shutdown();
			}
		}*/
		ArrayList<Future<Integer>> result=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			result.add(exec.submit(new Fibonacci(i)));
		}
		for (Future<Integer> future : result) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				exec.shutdown();
			}
		}
	}
}
