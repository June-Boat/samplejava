/**
 * 
 */
package collectiontest;
import java.util.*;
/**
 * @author June-Boat
 *
 */
class Gerbil{
	private static int count;
	private final int id=count++;
//	public String name;
//	public Gerbil(String name) {
//		this.name=name;
//	}
	void hop() {
		System.out.println("the "+id+" Gerbil is jumpping");
	}
}

public class MapDemo {
	public static void main(String[] args) {
//		Map<String,Gerbil> map= new HashMap<>();
//		map.put("sopt", new Gerbil());
//		map.put("marpt", new Gerbil());
//		map.put("otjit", new Gerbil());
//		for (String s : map.keySet()) {
//			System.out.println(s+"\thashcode="+s.hashCode()+" \tvalue= "+map.get(s)+"\tvalueHashCode= "+map.get(s).hashCode());
//		}
//		Map<String,Gerbil> map2= new LinkedHashMap<>(map);
//		for (String s : map2.keySet()) {
//			System.out.println(s+"\thashcode="+s.hashCode()+" \tvalue= "+map2.get(s)+"\tvalueHashCode= "+map2.get(s).hashCode());
//		}
		
		   LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();              
           map.put("05","����");  
           map.put("03","����");  
           map.put("12","��ʮ��");                      
           map.put("04","����");           
           map.put("06","����");  
           map.put("01","��һ");  
           map.put("11","��ʮһ");  
           map.put("08","�Ű�");  
           map.put("15","��ʮ��");  
           map.put("09","�ž�");  
           map.put("02","�Ŷ�");  
           map.put("10","��ʮ");           
           map.put("14","��ʮ��");                  
           map.put("13","��ʮ��");  
           map.put("07","����");      
           System.out.println(map);
           Set keySet=map.keySet();  
           Iterator it=keySet.iterator();  
           while(it.hasNext()) {  
               Object key=it.next();  
               Object value=map.get(key);  
               System.out.println(key+"  "+value);  
           }  
           System.out.println(map.entrySet());
           
    }  
}
