/**
 * 
 */
package collectiontest;

import java.util.*;

/**
 * @author June-Boat
 *
 */
public class LInkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Integer> ints= new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		System.out.println(ints);
		System.out.println(ints.getFirst()+ints.element()+ints.peek());
		System.out.println(ints.removeFirst()+ints.remove()+ints.poll());
		System.out.println(ints);
		ints.addFirst(9);
		System.out.println("after addFirst "+ints);
		ints.offer(10);
		System.out.println("after offer "+ ints);
		ints.add(11);
		System.out.println("after add "+ints);
		ints.addLast(12);
		System.out.println("after addLast "+ints);
		ints.removeLast();
		System.out.println("after removeFirst "+ints);
	}
}
