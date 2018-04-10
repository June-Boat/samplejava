/**
 * 
 */
package exercise;

import java.util.*;

/**
 * @author June-Boat
 *
 */

public class MultiIterableClass {
	public Iterable<String> reversed(){
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return null;
					}
					
				};
			}
			
			
		};
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
				return new Iterator<String>(){

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return null;
					}
					
				};
			}
		};
	}
	
}
