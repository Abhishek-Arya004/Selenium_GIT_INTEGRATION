package demo.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer , String> map = new HashMap<>();
		
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3,"three");
		
		System.out.println(map);
		
		map.keySet();
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		//System.out.println(map.remove(2));
		
		
		
		

		System.out.println(map.get(1));
		
		System.out.println(map.entrySet());
		
		Set<Entry<Integer, String>> set =  map.entrySet();
		
	
		Hashtable<Integer , String> table = new Hashtable<>();
		

		table.put(1, "one");
		table.put(2, "two");
		table.put(3,"three");
		
		System.out.println(table);
		
		
		for(Integer key : map.keySet()) {
			
			System.out.println(key + " "  + map.get(key));
			
			//System.out.println(map.get(key));
			
			
			
		}
		
for(String values: map.values()) {
			
			System.out.println(values);
			
			//System.out.println(map.get(key));
			
			
			
		}
		
		
for(Map.Entry<Integer, String> entry : table.entrySet()) {
			
			
			
			System.out.println( entry.getKey() + " " +entry.getValue());
			
			
		}
		
		
		
		
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		
		while(iterator.hasNext()) {
			
			Map.Entry<Integer, String> entry = 	iterator.next();
			
			
			System.out.println( entry.getKey() + " " +entry.getValue());
			
		}
		 
		
		
		

	}

}
