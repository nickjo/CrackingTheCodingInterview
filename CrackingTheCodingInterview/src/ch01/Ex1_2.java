package ch01;

public class Ex1_2 {
	/*���ڿ��� ������ reverse �Լ��� �ۼ��Ͻÿ�*/
	public static void main(String[] args) {
		String s = "asdf12398dkddvpps";

		System.out.println("Before Reverse: " + s);
		System.out.println("After Reverse: " + reverse(s));
	}

	static String reverse(String s){
		StringBuffer temp = new StringBuffer();
		try {
			for(int i=s.length()-1; i >= 0; i--){
				temp.append(s.charAt(i));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return temp.toString();
	}
}
