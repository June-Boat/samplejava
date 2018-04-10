/**
 * 
 */
package collectiontest;
import java.util.*;
/**
 * @author June-Boat
 *
 */
class MapEntry<K,V> implements Map.Entry<K, V>{
	private K key;
	private V value;
	
	public MapEntry(K key,V value) {
		this.key=key;
		this.value=value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public V setValue(V v) {
		V result=value;
		value=v;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return ((key == null) ? 0 : key.hashCode())^ ((value == null) ? 0 : value.hashCode());
	}

	public boolean equals(Object obj) {
		if (getClass() != obj.getClass()) {
			return false;
		}
		MapEntry other = (MapEntry) obj;
		return (key==null?other.getKey()==null:key.equals(other.getKey()))&&(value==null?other.getValue()==null:value.equals(other.getValue()));
	}
	
	
}

public class SimpleHashMap<K,V> extends AbstractMap<K,V>{
	static final int SIZE =997;
	LinkedList<MapEntry<K,V>>[] buckets=new LinkedList[SIZE];
	public V put(K key,V value) {
		V oldValue = null;
		//通过Key获得数组下标index
		int index= Math.abs(key.hashCode())%SIZE;
		/*先判断对应位置是否有键值对*/
		if(buckets[index]==null)buckets[index]=new LinkedList<MapEntry<K,V>>();
		//取得对应的List
		LinkedList<MapEntry<K,V>> bucket=buckets[index];
		//判断List中键值对中key是否相等，相等时，修改原来的value或直接重置，不同时即no found，添加到list。
		MapEntry<K,V> pair = new MapEntry<>(key,value);//基于MapEntry的方法来存取，所以先创建一个MapEntry
		boolean found=false;
		ListIterator<MapEntry<K,V>> it=bucket.listIterator();
		while(it.hasNext()){
			MapEntry<K,V> tmp=it.next();
			if(tmp.getKey().equals(key)) {
				oldValue=tmp.getValue();
				/*tmp.setValue(pair.getValue());*/
				it.set(pair);
				found=true;
				break;
			}
		}
		if(!found) {
			bucket.add(pair);
		}
		return oldValue;
	}
	
	public V get(Object key) {
		int index= Math.abs(key.hashCode())%SIZE;
		if(buckets[index]==null)return null;
		for (MapEntry<K,V> pair : buckets[index]) {
			if(pair.getKey().equals(key)) {
				return pair.getValue();
			}
		}
		return null;
	}

	public Set<Map.Entry<K,V>> entrySet() {
		Set<Map.Entry<K,V>> set=new HashSet<Map.Entry<K,V>>();
		for (LinkedList<MapEntry<K,V>> bucket : buckets) {
			if(bucket==null)continue;
			for(MapEntry<K,V> entry:bucket)
				set.add(entry);
		}
		return set;
	}
	
	public static void main(String[] args) {
		SimpleHashMap<String,String> map=new SimpleHashMap<>();
		map.put("05","张五");  
        map.put("03","张三");  
        map.put("12","张十二");                      
        map.put("04","张四");           
        map.put("06","张六");  
        map.put("01","张一");  
        map.put("11","张十一");  
        map.put("08","张八");  
        map.put("15","张十五");  
        map.put("09","张九");  
        map.put("02","张二");  
        map.put("10","张十");           
        map.put("14","张十四");                  
        map.put("13","张十三");  
        map.put("07","张七");
        System.out.println(map);
		System.out.println(map.entrySet());
	}
	
}
