/**
 * 
 */
package com.samplejava;

import org.samplejava.SuperClass;

/**
 * @author June-Boat
 *
 */
public class SubClass extends SuperClass {
	public static void main(String[] args) {  
		   SuperClass sup = new SuperClass();  
		   SubClass sub = new SubClass();  
//		   sup.method(); //Compile Error  
		   sub.method();  //Compile OK 
		   //��SubClassȷʵ�Ǽ̳�����SuperClass����������method����������������SubClass�п��Ե����Լ���method����������SuperClass��protected�������䲻ͬ������SubClass��˵���ǲ��ɼ��ġ�

	}
}
