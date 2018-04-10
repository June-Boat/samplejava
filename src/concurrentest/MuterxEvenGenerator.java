/**
 * 
 */
package concurrentest;

import java.util.concurrent.locks.*;

/**
 * @author June-Boat
 *
 */
public class MuterxEvenGenerator extends IntGenerator{
	private int currentEvenValue=0;
	private Lock lock=new ReentrantLock();
	/* (non-Javadoc)
	 * @see concurrentest.IntGenerator#next()
	 */
	@Override
	public int next() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
