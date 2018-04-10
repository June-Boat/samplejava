/**
 * 
 */
package com.samplejava;
import org.samplejava.*;
/**
 * @author June-Boat
 *
 */
public class ProtectedTest {
	public static void main(String[] args) {
		son s=new son();
//		s.method();
		s.showMethod();
	}
}

class son extends SuperClass{
	void showMethod() {
		method();
	}
}