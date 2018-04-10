/**
 * 
 */
package collectiontest;

import java.util.*;

/**
 * @author June-Boat
 *
 */
public class ListIteration {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			ints.add(i);
		}
		System.out.println(ints);

		List<Integer> intsReverse = new ArrayList<>(ints.size());
		ListIterator<Integer> it = ints.listIterator(ints.size());
//		while (it.hasNext())
//			it.next();
		while (it.hasPrevious()) {
			intsReverse.add(it.previous());
		}
		System.out.println(intsReverse);
	}
}
