/**
 * 
 */
package exercise;

/**
 * @author June-Boat
 *
 */
public class Test {

	public static void main(String[] args){
		A a=new A();
		A ab=new B();
		B b =new B();
		a.staticGet();
		ab.staticGet();
		b.staticGet();
	}
}

//
class A{
	public void staticGet(){
		System.out.println("get A static method");
	}
	
	public int f() {
		return 1;
	}
}

class B extends A{
	public void staticGet() {
		System.out.println("get B static method");
	}
	
//	 long f() {		return 2L;	}//返回类型不能区分重载方法
}

interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}
class C{public int f() {return 1;}}

class C2 implements I1,I2{
	public void f() {};
	public int f(int i) {return 1;};
}

class C3 extends C implements I2{
	public int f(int i) {return 1;}
}

class C4 extends C implements I3{
	public int f() {return 1;}
}