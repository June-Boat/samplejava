/**
 * 
 */
package runnabletest;

/**
 * @author June-Boat
 *
 */
/*直接使用Thread继承
 * public class SimpleThread extends Thread{
	private int countDown=5;
	private static int threadCount =0;

	public SimpleThread() {
		super(Integer.toString(++threadCount));
		start();
	}
	
	@Override
	public String toString() {
		return "#"+getName()+"(" + countDown + "),";
	}


	@Override
	public void run() {
		while(true) {
			System.out.println(this);
			if(--countDown==0)return;
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new SimpleThread();
		}
	}
}*/

/*自管理来实现*/
public class SimpleThread implements Runnable{
	private int countDown=5;
	private static int threadCount =0;
	private Thread t=new Thread(this);
	public SimpleThread() {
		t.start();
	}
	@Override
	public String toString() {
		return Thread.currentThread().getName()+"(" + countDown + "),";
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(this);
			if(--countDown==0)return;
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new SimpleThread();
		}
	}
	
}
