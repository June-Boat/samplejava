/**
 * 
 */
package TestFurther;

/**
 * @author June-Boat
 *���һ���򵥷�����Pair<T>
 */
public class Pair<T> {
	private T min;
	private T max;
	
	public T getMin() {
		return min;
	}
	public void setMin(T min) {
		this.min = min;
	}

	public T getMax() {
		return max;
	}
	public void setMax(T max) {
		this.max = max;
	}

	public Pair() {
		min=null;max=null;
	}
	public Pair(T min,T max){
		this.min=min;
		this.max=max;
	}
}
