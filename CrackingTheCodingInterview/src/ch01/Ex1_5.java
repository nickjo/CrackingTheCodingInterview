package ch01;

import java.util.Scanner;

public class Ex1_5{
	/*
	같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드를 구현하라
	ex) aabccccccccaaa -> a2b1c8a3
	 */
	public static void main(String[] agrs){
		String str = "aabccccccccaaabacc";
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("압축할 문자열을 입력하시오");
			str = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("압축 전 문자열: " + str);
		str = zipInput(str);
		System.out.println("압축 후 문자열: " + str);
	}

	static String zipInput(String str){
		int count = 1;
		String temp = "";

		for(int i=0; i <= str.length()-1; i++){
			if(i == str.length()-1){ // 마지막 문자일 경우
				temp += Character.toString(str.charAt(i-1)) + count;
				break;
			}
			// 첫번째 문자
			if(str.charAt(i) == str.charAt(i+1)){ // 두 문자열이 같다면 count++
				count++;
			}else{
				temp += Character.toString(str.charAt(i)) + count;
				count = 1;
			}
		}
		
		// 압축한 문자열이 기존 문자열의 길이보다 작다면 압축된 문자열 return
		if(temp.length() < str.length()){
			str = temp;
		}else{
			System.out.println("압축한 문자열의 길이가 더 길어서 기존 문자열을 출력");
		}
		
		return str;
	}
}
