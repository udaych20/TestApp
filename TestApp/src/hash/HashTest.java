package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("BB","B");
		hashMap.put("AA","A");
		hashMap.put("CC","C");
		
		LinkedHashMap<String, String> lHashMap = new LinkedHashMap<>();
		lHashMap.put("C","A");
		lHashMap.put("B","B");
		lHashMap.put("A","C");
		
		TreeMap<String, String> t = new TreeMap<String,String>();
		t.put("C", "C");
		t.put("B", "B");
		t.put("A", "A");
		
		System.out.println(hashMap);
		System.out.println(lHashMap);
		System.out.println(t);
		
		new ArrayList<>();
		
	}
}
