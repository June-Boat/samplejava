/**
 * 
 */
package runnabletest;

/**
 * @author June-Boat
 *
 */
public class BasicThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new LiftOff()).start();
		}
		
		System.out.println("wait for LiftOff!");
	}
}
