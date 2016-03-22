package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1_3 {
	/*�� ���ڿ��� �Է� �޾� ���� �ϳ��� �ٸ� �ϳ��� �������� �Ǻ��ϴ� �޼��带 �ۼ��϶�
	 * 
	 * ����: �Էµ� �� ���ڿ��� ����, ���� ���� ������ ������ Ʋ����
	 * */
	public static void main(String[] args) {
		String inputStr1,inputStr2;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("ù��° ���ڿ��� �Է��ϼ���=>");
			inputStr1 = sc.nextLine();

			System.out.println();

			System.out.println("�ι�° ���ڿ��� �Է��ϼ���=>");
			inputStr2 = sc.nextLine();

			System.out.println();

			if(checkPermutaion(inputStr1, inputStr2)){
				System.out.println("�� ���ڿ��� ���� �Դϴ�.");
			}else{
				System.out.println("�� ���ڿ��� ������ �ƴմϴ�.");
			}


		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	static boolean checkPermutaion(String str1, String str2){
		/*
		���� �Ǻ� ���
		1. ���ڿ� ���� ����
		2. ���� �� �� ���ڿ��� �������� Ȯ��
		 */
		// �� ���ڿ��� List�� ����
		List<String> list1,list2;
		list1 = new ArrayList<>(Arrays.asList(str1.split("")));
		list2 = new ArrayList<>(Arrays.asList(str2.split("")));
		
		// ���� üũ
		if(list1.size() != list2.size()){
			return false;
		}
		
		// �� �ϳ��� ����Ʈ�� �ٸ� ����Ʈ�� ������Ʈ�� ��� ���� �ϰ� �ִ��� Ȯ��
		if(!list1.containsAll(list2)){
			return false;
		}
		
		return true;
	}
}
