/**
 * 
 */
package samplejava;

import java.util.Arrays;
import java.util.Date;
/**
 * @author June-Boat
 *�ɻ����p252final����
 *��𣺾ֲ���ķ���ֻ�������� ����Ϊfinal�ľֲ�������
 *�����Ϊʲô�����ھֲ����������ⲿ���һЩ��������ʱ�����뽫��Ӧ�Ĳ��������η���Ϊfinal
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
			dates[i]= new Date()//�����ڲ���
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
