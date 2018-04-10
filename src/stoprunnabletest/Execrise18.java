/**
 * 
 */
package stoprunnabletest;

/**
 * @author June-Boat
 *
 */
class InvokeClass implements Runnable{
	static class InvokedClass{
		static void useSleep() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	@Override
	public void run() {
			System.out.println("useSleep");
			try {
				InvokedClass.useSleep();
			}catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
			System.out.println("the runnable end");
	}
	
}

public class Execrise18 {
	public static void main(String[] args) {
		Thread t=new Thread(new InvokeClass());
		t.start();
		System.out.println("trying to interrupt");
		t.interrupt();
	}
}
