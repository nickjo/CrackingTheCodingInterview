package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1_3 {
	/*두 문자열을 입력 받아 그중 하나가 다른 하나의 순열인지 판별하는 메서드를 작성하라
	 * 
	 * 순열: 입력된 두 문자열의 문자, 숫자 등이 같지만 순서가 틀린것
	 * */
	public static void main(String[] args) {
		String inputStr1,inputStr2;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("첫번째 문자열를 입력하세요=>");
			inputStr1 = sc.nextLine();

			System.out.println();

			System.out.println("두번째 문자열를 입력하세요=>");
			inputStr2 = sc.nextLine();

			System.out.println();

			if(checkPermutaion(inputStr1, inputStr2)){
				System.out.println("두 문자열은 순열 입니다.");
			}else{
				System.out.println("두 문자열은 순열이 아닙니다.");
			}


		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	static boolean checkPermutaion(String str1, String str2){
		/*
		순열 판별 방법
		1. 문자열 길이 동일
		2. 정렬 후 두 문자열이 동일한지 확인
		 */
		// 두 문자열을 List에 저장
		List<String> list1,list2;
		list1 = new ArrayList<>(Arrays.asList(str1.split("")));
		list2 = new ArrayList<>(Arrays.asList(str2.split("")));
		
		// 길이 체크
		if(list1.size() != list2.size()){
			return false;
		}
		
		// 두 하나의 리스트가 다른 리스트의 엘러먼트를 모두 포함 하고 있는지 확인
		if(!list1.containsAll(list2)){
			return false;
		}
		
		return true;
	}
}
