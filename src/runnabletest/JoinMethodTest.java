/**
 * 
 */
package runnabletest;
import static net.mindview.util.Print.*;
/**
 * @author June-Boat
 *
 */
class Sleeper extends Thread{
	private int  duration;
	public Sleeper(String name,int duration) {
		super(name);
		this.duration = duration;
		start();
	}
	@Override
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			print(getName()+" was interrupted. isInterrupted():"+isInterrupted());
//			return;
		}
		print(getName()+" has awakened");
	}
	
}

class Joiner extends Thread{
	private Sleeper sleeper;

	/**
	 * @param sleeper
	 */
	public Joiner(String name,Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			print("Interrupted");
		}
		print(getName()+" join completed");
	}
}

public class JoinMethodTest {
	public static void main(String[] args) {
		Sleeper
		sleepy = new Sleeper("Sleepy", 1500),
		grumpy = new Sleeper("grumpy", 1500);
		Joiner
		joinSleepy=new Joiner("joinSleepy",sleepy),
		joinGrumpy=new Joiner("joinGrumpy",grumpy);
		grumpy.interrupt();
	}
}
