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
		   //类SubClass确实是继承了类SuperClass（包括它的method方法），所以在类SubClass中可以调用自己的method方法。但类SuperClass的protected方法对其不同包子类SubClass来说，是不可见的。

	}
}
