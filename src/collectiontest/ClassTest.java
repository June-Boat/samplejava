/**
 * 
 */
package collectiontest;

import java.awt.List;

/**
 * @author June-Boat
 *
 */

public class ClassTest {
	static void getInherit(Class c) {
		if(c.getSuperclass()!=null)getInherit(c.getSuperclass());
		System.out.println(c.getName());
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		getInherit(java.util.Date.class);
		Class.forName("java.util.Date");
	}
}
