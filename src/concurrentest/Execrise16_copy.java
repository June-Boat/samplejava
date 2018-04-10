/**
 * 
 */
package concurrentest;
import static net.mindview.util.Print.*;
/**
 * @author June-Boat
 *
 */
class Otest{
	private Object o1=new Object(),o2=new Object();
	public synchronized void f() {
		for (int i = 0; i < 5; i++) {
			print("f()");
			Thread.yield();
		}
	}
	public void g() {
		synchronized(o1) {
			for (int i = 0; i < 5; i++) {
				print("g()");
				Thread.yield();
			}
		}
	}
	public void k() {
		
		synchronized(o2) {
			for (int i = 0; i < 5; i++) {
				print("k()");
				Thread.yield();
			}
		}
	}
}

public class Execrise16_copy {
	public static void main(String[] args) {
		Otest o=new Otest();
		new Thread() {
			public void run() {
				o.f();
			}
		}.start();
		new Thread() {
			public void run() {
				o.g();
			}
		}.start();
		o.k();
	}
	
}
