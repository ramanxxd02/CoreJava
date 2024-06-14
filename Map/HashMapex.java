package in.co.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapex {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1,"Raman");
		m.put(2,"Himanshi");
		m.put(3,"Megha");
//		System.out.println(m);
//		System.out.println(m.get(2));
	for (Object obj :m.entrySet()) {
		Map.Entry entry=(Map.Entry) obj;
		Object key=entry.getKey();
		Object value=entry.getValue();
		System.out.println("keys:"+key+"="+"values:"+value);
//		for (Object value1 :m.values()) {
//			System.out.println("value:"+value1);
//			
//		}
	}
	}

}
