/**
 * 
 */
package cooperation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author June-Boat
 *
 */
class Car{
	private boolean waxOn=false;
	public synchronized void waxed() {//打蜡
		waxOn=true;
		notifyAll();
	}
	public synchronized void buffed() {
		waxOn=false;
		notifyAll();
	}
	public synchronized void waitForWaxing() throws InterruptedException {
		while(waxOn==false)
			wait();
	}
	public synchronized void waitForBuffing() throws InterruptedException {
		while(waxOn==true)
			wait();
	}
}
class WaxOn implements Runnable{
	private Car car;
	public WaxOn(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				System.out.println("Wax on! ");
				TimeUnit.MILLISECONDS.sleep(200);//模拟打蜡过程用时
				car.waxed();//设置打蜡完成标志waxOn==true
				car.waitForBuffing();//等待抛光完成，期待waxOn==false
			}
		}catch (InterruptedException e) {
			System.out.println("Exing via interrupt");
		}
		System.out.println("Exiting Wax On task");
	}
}
class WaxOff implements Runnable{
	private Car car;
	public WaxOff(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				car.waitForWaxing();//等待wanOn==true，即使比打蜡任务先执行，也会因wanOn==false而挂起
				System.out.println("Wax off!");
				TimeUnit.MILLISECONDS.sleep(200);//模拟抛光用时
				car.buffed();//设置wanOn==false，唤醒所有等待任务
			}
		}catch (InterruptedException e) {
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax off task");
	}
}
public class WarOMatic {
	public static void main(String[] args) throws InterruptedException {
		Car car=new Car();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}
}
