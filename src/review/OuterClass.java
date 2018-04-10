/**
 * 
 */
package review;

/**
 * @author June-Boat
 *
 */
public class OuterClass {
	int i=0;
	void dosomething(){
		System.out.println("i am outerclass!");
	}
	public static void main(String[] args) {
		OuterClass oc= new OuterClass();
		oc.dosomething();
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.dosomething();
	}
	
	private static class InnerClass{
		void dosomething() {
			System.out.println("i am innerclass");
		}
	}
	
}
