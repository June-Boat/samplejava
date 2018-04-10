/**
 * 
 */
package concurrentest;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author June-Boat
 *p690 练习690
 */
public class Execrise15 {
/*	private int count=0;
*/	private int count1,count2,count3;
	{count1=count2=count3=0;}
	
	public /*synchronized*/ void add1() {
		System.out.println("add1: "+ ++count1);
	}
	public /*synchronized*/ void add2() {
		count2+=2;
		System.out.println("add2: "+count2);
	}
	public /*synchronized*/ void add3() {
		count3+=3;
		System.out.println("add3: "+count3);
	}
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.exit(0);
			}
		}, 5);
		Execrise15 a1=new Execrise15();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new Thread() {
			public void run() {
				while(true)
				a1.add1();
			}
		});
		exec.execute(new Thread() {
			public void run() {
				while(true)
				a1.add2();
			}
		});
		exec.execute(new Thread() {
			public void run() {
				while(true)
				a1.add3();
			}
		});
	}
}
