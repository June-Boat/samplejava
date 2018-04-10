/**
 * 
 */
package generic;

import java.util.Iterator;

/**
 * @author June-Boat
 *
 */
interface Generator<T>{T next();}

class Fibonacci implements Generator<Integer>{
	private int count=0;
	@Override
	public Integer next() {return fib(count++);}
	
	private int fib(int n) {
		if(n<2)return 1;
		return fib(n-2)+fib(n-1);
	}
} 

/*组合的方式来实现IterableFibonacci*/
public class IterableFibonacci implements Iterable<Integer>{
	private Fibonacci f=new Fibonacci();
	private int size;
	public IterableFibonacci(int size){
		this.size=size;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return size>0;
			}

			@Override
			public Integer next() {
				size--;
				return f.next();
			}
			
		};
	}
	
	public static void main(String[] args) {
		for(int i: new IterableFibonacci(18))
			System.out.print(i+" ");
	}
}
