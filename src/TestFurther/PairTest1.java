/**
 * 
 */
package TestFurther;

/**
 * @author June-Boat
 *
 */
public class PairTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words = {"Mary","had","a","little","lamb"};
		Pair<String> mm = ArrayAlg1.minmanx(words);
		System.out.println("min="+mm.getMin());
		System.out.println("max="+mm.getMax());
	}

}

class ArrayAlg1{
	public static Pair<String> minmanx(String[] a){
		if(a==null||a.length==0)return null;
		String min = a[0];
		String max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(min.compareTo(a[i])>0)min=a[i];
			if(max.compareTo(a[i])<0)max=a[i];
		}
		return new Pair<>(min,max);
	}
}
