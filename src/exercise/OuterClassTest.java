/**
 * 
 */
package exercise;

/**
 * @author June-Boat
 *
 */
interface Port {
	void showPortMessage();
}

class OuterClass {
	static private int state = 0;
	public int getState() {return state;}
	private void showPrivate() {System.out.println("it is private");}
	public void showPublic() {System.out.println("it is public");}

	public Port getInnerClass(boolean b) {
		return new Port(){
				public void showPortMessage() {
					System.out.println("InnerClass implements Port");
					state = 5;
					showPrivate();
					showPublic();
					System.out.println(getState());
				}

			};
	}
	
	static class  cheshi{
		static void print() {
			System.out.println("OuterClass.state="+state);
		}
	}
}

public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		Port i = o.getInnerClass(true);
		i.showPortMessage();
		System.out.println(o.getState());
		
		OuterClass.cheshi c= new OuterClass.cheshi();
		OuterClass.cheshi.print();
	}

}