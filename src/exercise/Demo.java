/**
 * 
 */
package exercise;

import java.util.*;

import collectiontest.Gerbil;


/**
 * @author June-Boat
 *
 */
//class Gerbil{
//	private static int count;
//	private final int id=count++;
////	public String name;
////	public Gerbil(String name) {
////		this.name=name;
////	}
//	void hop() {
//		System.out.println("the "+id+" Gerbil is jumpping");
//	}
//}

public class Demo {
	public static void main(String[] args) {
		Map<String,Gerbil> map= new HashMap<>();
		map.put("sopt", new Gerbil());
		map.put("marpt", new Gerbil());
		map.put("otjit", new Gerbil());
		Iterator<String> it=map.keySet().iterator();
//		while(it.hasNext()) {
//			String tmp = it.next();
//			System.out.println(tmp);
//			map.get(tmp).hop();
//		}
		
		for (String name : map.keySet()) {
			
			map.get(name).hop();
		}
		
		
	}
}
