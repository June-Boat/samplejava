/**
 * 
 */
package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author June-Boat
 *
 */
public class SampleCollection {
	public static void main(String[] args) {
		Collection<Integer> c= new ArrayList<>(Arrays.asList(1,2,3,4,5));
		c.addAll(Arrays.asList(6,7,8,9,10));
		Collections.addAll(c, 1,2);
		
		for (Integer i : c) {
			System.out.print(i+",");
		}
		
		List<Integer> list=Arrays.asList(11,12,13);
		list.set(1, 99);
		list.add(21);
		for (Integer i : list) {
			System.out.print(i+",");

		}
	}
}
