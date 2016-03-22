package ch01;

import java.util.Scanner;

public class Ex1_5{
	/*
	���� ���ڰ� �������� �ݺ��� ���, �� Ƚ���� ����� ���ڿ��� �����ϴ� �޼��带 �����϶�
	ex) aabccccccccaaa -> a2b1c8a3
	 */
	public static void main(String[] agrs){
		String str = "aabccccccccaaabacc";
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������ ���ڿ��� �Է��Ͻÿ�");
			str = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("���� �� ���ڿ�: " + str);
		str = zipInput(str);
		System.out.println("���� �� ���ڿ�: " + str);
	}

	static String zipInput(String str){
		int count = 1;
		String temp = "";

		for(int i=0; i <= str.length()-1; i++){
			if(i == str.length()-1){ // ������ ������ ���
				temp += Character.toString(str.charAt(i-1)) + count;
				break;
			}
			// ù��° ����
			if(str.charAt(i) == str.charAt(i+1)){ // �� ���ڿ��� ���ٸ� count++
				count++;
			}else{
				temp += Character.toString(str.charAt(i)) + count;
				count = 1;
			}
		}
		
		// ������ ���ڿ��� ���� ���ڿ��� ���̺��� �۴ٸ� ����� ���ڿ� return
		if(temp.length() < str.length()){
			str = temp;
		}else{
			System.out.println("������ ���ڿ��� ���̰� �� �� ���� ���ڿ��� ���");
		}
		
		return str;
	}
}
