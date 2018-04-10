/**
 * 
 */
package runnabletest;

import java.util.concurrent.ThreadFactory;

/**
 * @author June-Boat
 *
 */
public class DaemonThreadFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		Thread t=new Thread(r);
		t.setDaemon(true);
		return t;
	}
}
