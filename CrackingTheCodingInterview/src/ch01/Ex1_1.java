package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex1_1 {
	public static void main(String[] args) {
		/*해당 문자열이 유일한 문자인지 판별하시오*/
		String str = "Hello, Wrd";
		List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
		
		try {
			// List to Map
			// list를 map에 저장 할 시에 list의 value를 키로 저장 하므로 문자열이 중복되어 있다면 키 중복으로인해 에러 발생 
			Map<String, String> map = list.stream()
					.collect(Collectors.toMap(String::toString, listStrings -> listStrings));
			
			// 에러 발생 하지 않는다면 map 출력
			map.forEach((k,v) -> System.out.println("key:"+ k + ", value:" + v));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
