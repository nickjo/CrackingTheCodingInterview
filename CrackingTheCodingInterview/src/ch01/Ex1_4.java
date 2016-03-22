package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex1_4 {
	/*
	�־��� ���ڿ��� ������� %20���� ä��� �޼��带 �ۼ��Ͻÿ�
	����: java�� �����Ѵٸ�, ���� �迭�� ����Ͽ� �ʿ��� ������ �� ���ڿ� �ٷ� ������ �� �ֵ��� �϶�
	*/
	public static void main(String[] args) {
		String inputStr;
		Scanner sc = new Scanner(System.in);
		List<String> list;
		
		try {
			System.out.println("���ڿ��� �Է��Ͻÿ� =>");
			inputStr = sc.nextLine();
			
			list = fillEmptySpace(inputStr);
			System.out.println();
			
			// ��Ʈ�� ���(jdk8)
			Stream stream = list.stream();
			stream.forEach(System.out::print);
			System.out.println();
			
			// ���ͷ����� ���
			Iterator it = list.iterator();
			while(it.hasNext()){
				System.out.print(it.next());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	static List<String> fillEmptySpace(String str) throws Exception{
		str = str.replaceAll(" ","%20");
		List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
		
		return list;
	}
}
