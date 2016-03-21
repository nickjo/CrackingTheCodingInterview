package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex1_1 {
	public static void main(String[] args) {
		/*�ش� ���ڿ��� ������ �������� �Ǻ��Ͻÿ�*/
		String str = "Hello, Wrd";
		List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
		
		try {
			// List to Map
			// list�� map�� ���� �� �ÿ� list�� value�� Ű�� ���� �ϹǷ� ���ڿ��� �ߺ��Ǿ� �ִٸ� Ű �ߺ��������� ���� �߻� 
			Map<String, String> map = list.stream()
					.collect(Collectors.toMap(String::toString, listStrings -> listStrings));
			
			// ���� �߻� ���� �ʴ´ٸ� map ���
			map.forEach((k,v) -> System.out.println("key:"+ k + ", value:" + v));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
