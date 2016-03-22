package ch01;

public class Ex1_6 {
	/*M*N 행렬을 부가적인 행렬을 사용하지 않고 90도 회전 시키는 메서드를 작성하라.*/
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
