package samplejava;
/*一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 开方后再平方，看是否等于原值
 */
public class execrise13 {
	public static void main(String[] agrs) {
		for(int i=0;i<10000;i++) {
			int j=(int)Math.sqrt(i+100);
			if(j*j==i+100) {
				int k=(int)Math.sqrt(i+268);
				if(k*k==i+268)System.out.println("the number is "+i);
			}
		}
	}
}
