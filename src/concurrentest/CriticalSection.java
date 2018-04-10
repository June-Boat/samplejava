/**
 * 
 */
package concurrentest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author June-Boat
 *
 */
class Pair {// 数据结构
	private int x, y;
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Pair() {
		this(0,0);
	}
	public int getX() {return x;}
	public int getY() {
		return y;
	}
	public void incrementX() {
		x++;
	}
	public void incrementY() {
		y++;
	}
	@Override
	public String toString() {
		return "Pair [x=" + x + ", y=" + y + "]";
	}
	/*自定义异常*/
	public class PairValueNotEqualException extends RuntimeException {
		public PairValueNotEqualException() {
			super("Pair values not equal: "+Pair.this);
		}
	}
	public void checkState() {
		if(x!=y) {
			throw new PairValueNotEqualException();
		}
	}
}

abstract class PairManager {
	AtomicInteger checkConter = new AtomicInteger(0);
	protected Pair p = new Pair();
	private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());
	public synchronized Pair getPair() {
		return new Pair(p.getX(),p.getY());
	}
	/*存储Pair p到列表*/
	protected void store(Pair p) {
		storage.add(p);
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	public abstract void increment();
}

class PairManager1 extends PairManager {
	@Override
	public synchronized void increment() {
		p.incrementX();
		p.incrementY();
		store(getPair());
	}
}

class PairManager2 extends PairManager {
	@Override
	public void increment() {
		Pair temp;
		synchronized(this) {
			p.incrementX();
			p.incrementY();
			temp=getPair();
		}
		store(temp);
	}

}

class PairManipulator implements Runnable {
	private PairManager pm;
	public PairManipulator(PairManager pm) {
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true)
			pm.increment();
	}
	@Override
	public String toString() {
		return "Pair:"+pm.getPair()+"checkerCounter=" + pm.checkConter.get();
	}
	
}

class PairChecker implements Runnable {
	private PairManager pm;
	public PairChecker(PairManager pm) {
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true) {
			pm.checkConter.incrementAndGet();
			pm.getPair().checkState();
		}
	}
}

public class CriticalSection {
	static void testApproaches(PairManager pman1,PairManager pman2) {
		ExecutorService exec=Executors.newCachedThreadPool();
		PairManipulator
			pm1=new PairManipulator(pman1),
			pm2=new PairManipulator(pman2);
		PairChecker
			pcheck1=new PairChecker(pman1),
			pcheck2=new PairChecker(pman2);
		exec.execute(pm1);
		exec.execute(pm2);
		exec.execute(pcheck1);
		exec.execute(pcheck2);
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		}catch (InterruptedException e) {
			System.out.println("sleep interrupted");
		}
		System.out.println("pm1: "+pm1+"\npm2: "+pm2);
		System.exit(0);
	}
	public static void main(String[] args) {
		PairManager
			pman1=new PairManager1(),
			pman2=new PairManager2();
		testApproaches(pman1, pman2);
	}
}
