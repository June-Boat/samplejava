/**
 * 
 */
package concurrentest;

/**
 * @author June-Boat
 *p682
 */
public class SerialNumberGenerator {
	private static volatile int serialNumber=0;
	public synchronized static int nextSerialNumber() {//由于++是非原子操作，所以需要synchronized同步控制，
		return serialNumber++;
	}
}
