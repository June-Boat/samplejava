/**
 * 
 */
package com.samplejava;
import org.samplejava.SuperClass;
/**
 * @author June-Boat
 *
 */
public class SubClass1 extends SuperClass{
	public static void main(String[] args) {
		SubClass1 sub1=new SubClass1();
		SubClass2 sub2=new SubClass2();
		sub1.method();
//		sub2.method();//error
		//不能在一个子类中访问另一个子类的protected方法，尽管这两个子类继承自同一个父类。 
		sub2.showMethod();
	}
}

class SubClass2 extends SuperClass{
	void showMethod(){
		super.method();
	}
//所以要通过重写method方法，设为public，才能让其他类访问
}
