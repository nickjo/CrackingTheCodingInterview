package ch01;

public class Ex1_7 {
	/*M*N 행렬을 순회하면서 0인 원소를 발견하면, 해당 원소가 속한 행과 열의
	모든 원소를 0으로 설정하는 알고리즘을 작성하라.
	
	손코딩 하자...머리로 할려니까...안되네...암산이 안되나바...ㅠㅠ
	*/
	public static void main(String[] args) {
		int[][] mn = {
				{1,2,3,4},
				{0,6,7,8},
				{9,10,11,12},
				{13,14,0,16}
		};
		int zeroIndex[][] = new int[2][mn[0].length];
		int check = 0;
		
		for(int i=0; i < mn.length; i++){
			for(int j=0; j < mn[i].length; j++){
				if(mn[i][j] == 0){
					zeroIndex[0][check] = i;
					zeroIndex[1][check++] = j;
				}
			}
		}
		
		for(int i=0; i < zeroIndex.length; i++){
			for(int j=0; j < check; j++){
				// 최초는 행을 출력하고, 다음중은 열을 출력한다
				// 0이 포함된 행들의 모든 원소를 0으로 치환
				
				// i == 0 일때는 행들의 원소를 0으로 치환
				if(i == 0){
					System.out.println(zeroIndex[i][j] + "  " + i + "  " + j);
					for(int k=0; k < mn.length; k++){
						for(int l=0; l < mn[zeroIndex[i][j]].length; l++){
							//mn[k][l] = 0;
						}
					}
				}/*else if(i == 1){ // 열들의 원소를 0 으로 치환
					for(int k=0; k < mn.length; k++){
						for(int l=0; l < mn[zeroIndex[i][j]].length; l++){
							mn[l][k] = 0;
						}
					}
				}*/
			}
		}
		
		// 0으로 치환 후 전체 배열 출력
		/*for(int i=0; i < mn.length; i++){
			for(int j=0; j < mn[i].length; j++){
				System.out.print(mn[i][j] + " ");
			}
			System.out.println();
		}*/
	}
}
