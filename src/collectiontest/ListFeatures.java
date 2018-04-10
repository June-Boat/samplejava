/**
 * 
 */
package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author June-Boat
 *
 */
public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> ints= new ArrayList<>(Arrays.asList("赵一","王二","张三","李四","红五","孙六","黄七"));
		System.out.println("1: "+ints);
		ints.add("王八");
		System.out.println("2: "+ints);
		System.out.println("3: "+ints.contains("王八"));
		ints.remove("王八");
		String i=ints.get(2);
		System.out.println("4: "+i+" "+ints.indexOf(i));
		String cymric = new String("蓝九");
		System.out.println("5: "+ints.indexOf(cymric));
		System.out.println("6: "+ints.remove(cymric));
		System.out.println("7: "+ints.remove(i));
		System.out.println("8: "+ints);
		ints.add(3, new String("钱十"));
		System.out.println("9: "+ints);
		List<String> sub=ints.subList(1, 4);
		System.out.println("subList: "+sub);
		System.out.println("10: "+ints.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted subList: "+sub);
		
		System.out.println("11: "+ints.containsAll(sub));
		Collections.shuffle(sub);
		System.out.println("shuffled subList: "+sub);
		System.out.println("12: "+ints.containsAll(sub));
		List<String> copy= new ArrayList<String>(ints);
		sub=Arrays.asList(ints.get(1),ints.get(2));
		System.out.println("sub: "+sub);
		copy.retainAll(sub);//
		System.out.println("13: "+copy);
		copy=new ArrayList<String>(ints);//get a fresh copy 
		copy.remove(2);
		System.out.println("14: "+copy);
		copy.removeAll(sub);
		System.out.println("15: "+copy);
		copy.set(1, "孙十一");
		System.out.println("16: "+copy);
		copy.addAll(2,sub);
		System.out.println("17: "+copy);
		System.out.println("18: "+ints.isEmpty());
		ints.clear();
		System.out.println("19: "+ints);
		System.out.println("20: "+ints.isEmpty());
		ints.addAll(Arrays.asList("12","13","14","15"));
		System.out.println("21: "+ints);
		Object[] o = ints.toArray();
		System.out.println("22: "+o[3]);
		String[] pa=ints.toArray(new String[0]);
		
	}
}
