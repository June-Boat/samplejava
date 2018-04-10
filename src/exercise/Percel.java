/**
 * 
 */
package exercise;

/**
 * @author June-Boat
 *
 */
class Wrapping {
	private int i;
	public Wrapping(int x) {
		i=x;
	}
	public int value() {
		return i;
	}
}

public class Percel {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value()*47;
			}
		};
	}
	
	public static void main(String[] args) {
		Percel p = new Percel();
		Wrapping w= p.wrapping(10);
		System.out.println(w.value());
	}
}
