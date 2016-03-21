package Hashing;

public class HashC {
	/* 연결 리스트의 셀 */
	private class Cell{
		MyKey key; // 키
		Object data; // 데이터
		Cell next;
		
		/**
		 * 
		 * @param aKey 키
		 * @return aData 데이터
		*/
		private Cell(MyKey aKey, Object aData){
			key = aKey;
			data = aData;
		}
	} // end class Cell
	
	Cell[] table; // 해시 표
	int bucketSize; // 버킷의 개수
	int nElements; // 등록되어 있는 데이터의 개수
	
	// 해시 표의 크기(기본 값)
	static final int DEFAULT_BUCKET_SIZE = 50;
	
	/*
	 * 해시 표를 생성한다(크기는 DEFAULT_BUCKET_SIZE)
	*/
	public HashC(){
		this(DEFAULT_BUCKET_SIZE);
	}
	
	/**
	 * 해시 표를 생성한다
	 * @param bucketSize 해시 표의 크기
	 */
	public HashC(int bucketSize){
		// 해시 표의 역할을 하는 배열을 할당한다
		table = new Cell[bucketSize];
		
		// 해시 표의 버킷 개수를 기록해 둔다
		this.bucketSize = bucketSize;
		
		// 요소의 개수를 0으로 해 둔다
		nElements = 0;
	}
	
	/**
	 * 해시 함수
	 * 키가 되는 객체의 hashCode 메소드가 반환한 값을,
	 * 버킷의 개수로 나눈 나머지를 반환
	 * @param key 키
	 * @return 주어진 키에 대한 해시 값
	 */
	private int hash(MyKey key){
		return key.hashCode() % bucketSize;
	}
	
	/**
	 * 해시 표를 탐색한다
	 * @param key 탐색할 키
	 * @return 키가 발견되면 그것을 반환.
	 * 			발견되지 않으면 null을 반환
	 */
	public Object find(MyKey key){
		for(Cell p = table[hash(key)]; p != null; p = p.next){
			if(key.equals(p.key)){
				return p.data;
			}
		}
		return null;
	}
	
	/**
	 * 해시 표에 데이터를 삽입한다
	 * 
	 * @param key 키
	 * @param data 등록할 데이터
	 * @return 등록에 성공하면 true,
	 * 			실패하면(이미 키 값이 같은 데이터가 있으면) false를 반환
	 */
	public boolean insert(MyKey key,Object data){
		if(find(key) != null){
			return false;
		}
		Cell p = new Cell(key, data);
		int h = hash(key);
		p.next = table[h];
		table[h] = p;
		
		nElements++; // 요소의 개수를 1 증가
		return true;
	}
	
	/**
	 * 해쉬 표에서 데이터를 삭제한다
	 * 
	 * @param key 삭제할 데이터의 키
	 * @return 삭제에 성공하면 true, 데이터를 찾지 못하면 false를 반환
	 */
	public boolean delete(MyKey key){
		int h = hash(key);
		
		// 버킷이 비어 있는가?
		if(table[h] == null){
			return false;
		}
		
		// 리스트의 선두 셀이 삭제할 데이터인가?
		if(key.equals(table[h].key)){
			Cell p = table[h];
			table[h] = p.next;
			nElements--; // 요소의 개수를 1 감소
			return true;
		}
		
		// 리스트의 두번째 셀 이후부터 순서대로 체크한다
		Cell p;
		Cell q;
		for(q=table[h], p=q.next; p!=null; q=p, p=p.next){
			if(key.equals(p.key)){
				q.next = p.next;
				nElements--; // 요소의 개수를 1 감소
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 해시 표의 내용을 문자열로 반환
	 * 
	 * @return 해시 표의 내용
	 */
	public String toString(){
		String s = "";
		
		// 모든 버킷을 순서대로 처리한다
		for(int i=0; i < table.length; i++){
			s += "버킷 " + i + ":";
			
			// 이 버킷의 내용을 문자열 s에 추가한다
			for(Cell p=table[i]; p!=null; p=p.next){
				s += "[" + p.key + ":" + p.data + "]";
			}
			s += "\n";
		}
		// 등록 되어 있는 요소의 개수를 추가한다
		s += "요소의 개수:" + nElements + "\n";
		
		return s;
	}
}






























