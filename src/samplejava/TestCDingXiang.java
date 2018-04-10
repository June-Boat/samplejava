/**
 * 
 */
package samplejava;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author June-Boat
 *
 */
public class TestCDingXiang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PrintStream out = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			System.out.println("jsdjfkjdkfjalkjfkjk");
			System.setOut(out);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
