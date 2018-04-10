/**
 * 
 */
package collectiontest;

import java.util.Collections;
import java.util.LinkedList;;

/**
 * @author June-Boat
 *
 */
class Stack<T> {
	private LinkedList<T> storage = new LinkedList<>();
	public void push(T e) {
		storage.addFirst(e);
	}
	public T peek() {
		return storage.getFirst();
	}
	public T pop() {
		return storage.removeFirst();
	}
	public boolean isEmpty() {
		return storage.isEmpty();
	}
	public String toString() {
		return storage.toString();
	}
}

public class StackTest {
	public static <T> void calculate(Stack<Character> stack,char... str) {
		for (int i = 0; i < str.length; i++) {
			if(str[i]=='+') {
				if(i+1<str.length&&str[i+1]!='+'&&str[i+1]!='-')
					stack.push(str[++i]);
			}else{
				if(!stack.isEmpty())System.out.println(stack.pop());
			}
		}
		System.out.println(stack.isEmpty());
	}
	
	public static void main(String[] args) {
		Stack<String> stack= new Stack<>();
		for(String s:"dog cat horse bird eagle".split(" "))
			stack.push(s);
		while(!stack.isEmpty())
			System.out.println(stack.pop()+" ");
		String str="+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		calculate(new Stack<Character>(),str.toCharArray());
	}
}
