package samplejava;
/*һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
 * ��������ƽ�������Ƿ����ԭֵ
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
