package ch01;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Ex1_1 {
	public static void main(String[] args) {
		// 일반적으로 동기화가 필요 없다면 HashMap을, 동기화 보장이 필요하다면 Hashtable을 사용하면된다.
		Hashtable<Integer, String> map = new Hashtable<>();
		
		map.put(1, "aaa");
		map.put(2, "ccc");
		map.put(3, "bbb");
		
		System.out.println(map.get(1));
		System.out.println(map.size());
		
		Enumeration key = map.keys();
		
		while(key.hasMoreElements()){
			System.out.println(map.get(key.nextElement()));
		}
	}
}
