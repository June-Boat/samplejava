/**
 * 
 */
package concurrentest;

/**
 * @author June-Boat
 *
 */
public class EvenGenerator extends IntGenerator{
	private int currentEvenValue=0;
	/* (non-Javadoc)
	 * @see concurrentest.IntGenerator#next()
	 */
	@Override
	public synchronized int next() {
		++currentEvenValue;
		Thread.yield();//使并发问题显现得快些
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator());
	}
}
