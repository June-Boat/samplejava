/**
 * 
 */
package concurrentest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author June-Boat
 *
 */
class ExplicitPairManager1 extends PairManager{
	private Lock lock=new ReentrantLock();
	public /*synchronized*/ void increment() {
		lock.lock();
		p.incrementX();
		p.incrementY();
		store(getPair());
		lock.unlock();
	}
	
}

class ExplicitPairManager2 extends PairManager{
	private Lock lock=new ReentrantLock();
	public void increment() {
		Pair temp;
		lock.lock();
		try {
			p.incrementX();
			p.incrementY();
			temp=getPair();
		}finally {
			lock.unlock();
		}
		store(temp);
	}
}

public class ExplicitCriticalSection {
	public static void main(String[] args) {
		PairManager
		pman1=new PairManager1(),
		pman2=new PairManager2();
		CriticalSection.testApproaches(pman1, pman2);
	}
}
