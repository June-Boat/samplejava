/**
 * 
 */
package samplejava;

import java.util.Arrays;
import java.util.Date;
/**
 * @author June-Boat
 *疑惑关于p252final例子
 *解答：局部类的方法只可以引用 定义为final的局部变量。
 *这就是为什么我们在局部类中引用外部类的一些方法参数时，必须将相应的参数的修饰符改为final
 */
public class TestAboutFinal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int counter=0;
		int counter[] =new int[1];
		Date[] dates = new Date[100];
		for (int i = 0; i < dates.length; i++)
			dates[i]= new Date()//匿名内部类
			{
				public int compareTo(Date other) {
//					counter++;
					counter[0]++;
					return super.compareTo(other);
				}
			};
		Arrays.sort(dates);
		System.out.println(counter[0]+"comparisons.");
		

	}

}
