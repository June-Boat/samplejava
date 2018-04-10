/**
 * 
 */
package samplejava;

/**
 * @author June-Boat
 *
 */
class MemberInner{
	private int d=1;
	private int a = 2;
	MemberInner.Inner2 inner3= this.new Inner2();
	
	public class Inner2{
		private int a =8;
		public void doSomething() {
			System.out.println(d);
			System.out.println(a);
			System.out.println(MemberInner.this.a);
		}
	}
}

public class MemberInnerClassTest {
	public static void main(String[] args) {
		MemberInner.Inner2 inner = new MemberInner().new Inner2();
		inner.doSomething();
	}
}
