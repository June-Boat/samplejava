/**
 * 
 */
package concurrentest;

/**
 * @author June-Boat
 *
 */
class TwoDataGenerator implements Runnable{
	private static int one=0,two=0;
	
	@Override
	public void run() {
		while(one==two) {
			++one;
			++two;
		}
	}

}

public class SynchronizedTest {
	
}
