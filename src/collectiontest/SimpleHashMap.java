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
		//ͨ��Key��������±�index
		int index= Math.abs(key.hashCode())%SIZE;
		/*���ж϶�Ӧλ���Ƿ��м�ֵ��*/
		if(buckets[index]==null)buckets[index]=new LinkedList<MapEntry<K,V>>();
		//ȡ�ö�Ӧ��List
		LinkedList<MapEntry<K,V>> bucket=buckets[index];
		//�ж�List�м�ֵ����key�Ƿ���ȣ����ʱ���޸�ԭ����value��ֱ�����ã���ͬʱ��no found����ӵ�list��
		MapEntry<K,V> pair = new MapEntry<>(key,value);//����MapEntry�ķ�������ȡ�������ȴ���һ��MapEntry
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
		System.out.println(map.entrySet());
	}
	
}
