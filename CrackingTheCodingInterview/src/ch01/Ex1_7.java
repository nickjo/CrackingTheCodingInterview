package ch01;

public class Ex1_7 {
	/*M*N ����� ��ȸ�ϸ鼭 0�� ���Ҹ� �߰��ϸ�, �ش� ���Ұ� ���� ��� ����
	��� ���Ҹ� 0���� �����ϴ� �˰����� �ۼ��϶�.
	
	���ڵ� ����...�Ӹ��� �ҷ��ϱ�...�ȵǳ�...�ϻ��� �ȵǳ���...�Ф�
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
				// ���ʴ� ���� ����ϰ�, �������� ���� ����Ѵ�
				// 0�� ���Ե� ����� ��� ���Ҹ� 0���� ġȯ
				
				// i == 0 �϶��� ����� ���Ҹ� 0���� ġȯ
				if(i == 0){
					System.out.println(zeroIndex[i][j] + "  " + i + "  " + j);
					for(int k=0; k < mn.length; k++){
						for(int l=0; l < mn[zeroIndex[i][j]].length; l++){
							//mn[k][l] = 0;
						}
					}
				}/*else if(i == 1){ // ������ ���Ҹ� 0 ���� ġȯ
					for(int k=0; k < mn.length; k++){
						for(int l=0; l < mn[zeroIndex[i][j]].length; l++){
							mn[l][k] = 0;
						}
					}
				}*/
			}
		}
		
		// 0���� ġȯ �� ��ü �迭 ���
		/*for(int i=0; i < mn.length; i++){
			for(int j=0; j < mn[i].length; j++){
				System.out.print(mn[i][j] + " ");
			}
			System.out.println();
		}*/
	}
}
