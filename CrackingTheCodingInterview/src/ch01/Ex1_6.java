package ch01;

public class Ex1_6 {
	/*M*N ����� �ΰ����� ����� ������� �ʰ� 90�� ȸ�� ��Ű�� �޼��带 �ۼ��϶�.*/
	public static void main(String[] args) {
		int[][] mn = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};

		try {
			for(int i=0; i < mn.length; i++){
				for(int j=0; j < mn[i].length; j++){
					System.out.print(mn[i][j] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	static int[][] rightAngleRotation(int[][] temp){
		
		
		
		return temp;
	}
}
