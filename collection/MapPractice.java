package collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapPractice {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add(new Emp(2, "a", 1000));
		t.add(new Emp(1, "a", 1000));
		
		System.out.println(t);

	}
}

/*
 * CHARATERISTICS
 * No order of insertion (no sorting)
 * Key cannot be duplicate
 * Key can be null
 * 
 * CRUDS
 * Create: put(Object, Object), putAll(Map), putIfAbsent(Object, Object), HashMap(Map)
 * Read: get(Object key), values(), keySet(), entrySet()
 * Update: put(Object, Object)																																	, replace(Integer, String), replace(Integer, String, String)
 * Delete: remove(Object key), clear()
 * Search: containsKey(Object key), containsValue(Object value), isEmpty()
 */



