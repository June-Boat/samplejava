/**
 * 
 */
package exercise;
import java.util.*;
/**
 * @author June-Boat
 *
 */

class SimpleObject extends Object{
	
}

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Double> p= new PriorityQueue<>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			p.offer(rand.nextDouble());
		}
		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}
		
		PriorityQueue<SimpleObject> o= new PriorityQueue<>();
		for (int i = 0; i < 10; i++) {
			o.offer(new SimpleObject());
		}
	}
}
