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
		//������һ�������з�����һ�������protected��������������������̳���ͬһ�����ࡣ 
		sub2.showMethod();
	}
}

class SubClass2 extends SuperClass{
	void showMethod(){
		super.method();
	}
//����Ҫͨ����дmethod��������Ϊpublic�����������������
}
