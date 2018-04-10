/**
 * 
 */
package generic;

import java.util.*;

/**
 * @author June-Boat
 *
 */
public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for(int i=0;i<n;i++)
			coll.add(gen.next());
		return coll;
	}
	public static <T> LinkedList<T> fill(LinkedList<T> coll,Generator<T> gen,int n){
		for(int i=0;i<n;i++)
			coll.add(gen.next());
		return coll;
	}
	public static <T> List<T> fill(List<T> coll,Generator<T> gen,int n){
		for(int i=0;i<n;i++)
			coll.add(gen.next());
		return coll;
	}
	

	
	public static void main(String[] args) {
		Collection<Integer> fnumbers =fill(new LinkedList<Integer>(),new Fibonacci(),12);
		for (int i : fnumbers) {
			System.out.print(i+", ");
		}
	}
}
