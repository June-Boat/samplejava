/**
 * 
 */
package exercise;

/**
 * @author June-Boat
 *
 */
public class FinalizeTest {
	public static void main(String[] args) {
		new FinalClass();
		System.gc();
	}
}
class FinalClass{
	FinalClass(){
		System.out.println("the Class is created!!!");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalizing.....");
		super.finalize();
	}
}