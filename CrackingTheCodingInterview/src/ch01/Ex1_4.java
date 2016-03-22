package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex1_4 {
	/*
	주어진 문자열의 빈공간을 %20으로 채우는 메서드를 작성하시오
	주의: java로 구현한다면, 문자 배열을 사용하여 필요한 연산을 각 문자에 바로 적용할 수 있도록 하라
	*/
	public static void main(String[] args) {
		String inputStr;
		Scanner sc = new Scanner(System.in);
		List<String> list;
		
		try {
			System.out.println("문자열을 입력하시오 =>");
			inputStr = sc.nextLine();
			
			list = fillEmptySpace(inputStr);
			System.out.println();
			
			// 스트림 출력(jdk8)
			Stream stream = list.stream();
			stream.forEach(System.out::print);
			System.out.println();
			
			// 이터레이터 출력
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
