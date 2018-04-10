/**
 * 
 */
package review;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author June-Boat
 *约瑟夫环-集合练习
 */
public class YosfTest {
	public static void main(String[] args) {
		int num=10000;
		long startTime=System.currentTimeMillis();
		System.out.println(YosfTest.getLuckyNumber1(num));
		long endTime=System.currentTimeMillis();
		System.out.println("time= "+(endTime-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		System.out.println(YosfTest.getLuckyNumber2(num));
		endTime=System.currentTimeMillis();
		System.out.println("time= "+(endTime-startTime)+"ms");
	}
	
	public static int getLuckyNumber1(int num) {//自己写的方法
		int count=3;
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 1; i <=num ; i++) {
			list.add(i);
		}
		Iterator it=list.iterator();
		while(--num>0) {
			for (int i = 0; i < count; i++) {
				if(!it.hasNext())it=list.iterator();
				it.next();
			}
			it.remove();;
		}
		return list.get(0);
	}
	public static int getLuckyNumber2(int num) {//i为指针，每当count为3倍数，移除数。
		int count=1;
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 1; i <=num ; i++) {
			list.add(i);
		}
		for (int i = 0; list.size()!=1; i++) {
			if(i==list.size())i=0;
			if(count%3==0)list.remove(i--);//注意后移一位，否则会越界。
			count++;
		}
		return list.get(0);
	}
}
