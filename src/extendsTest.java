/**
 * 
 */

/**
 * @author June-Boat
 *测试类的成员继承，
 *父类方法中访问的还是父类的color
 *猜测：子类中继承信息表明所继承的父类，
 *编译器调用方法和访问变量时，通过该信息找到父类的信息表并使用
 *其原因，个人认为是有隐式参数this，即this.color。
 */
class fatherClass{
	int color=1;
	void say() {
		System.out.println(color);
	}
}

class sonClass extends fatherClass{
	//int color=0;
	float color=3;
	void sayOfSon(){
		System.out.println(super.color);
	}
}

public class extendsTest {
	public static void main(String[] args) {
//		fatherClass father =new fatherClass();
//		sonClass son= new sonClass();
//		father.say();
//		son.say();
//		son.sayOfSon();
		
		long n=2000000000000L;
		System.out.println("n："+Long.toBinaryString(n));
	}
}
