package chap05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// System.arraycopy를 이용한 배열 복사
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
//System.arraycopy(Object src,int srcPos, Object dest,int destPos,int length)
//Object src : 원본 배열
//int srcPos : 원본 배열에서 복사할 항목의 시작 인덱스
//Object dest : 새로운 배열
//int destPis : 새로운 배열에서 붙여넣을 시작 인덱스
//int length : 복사할 개수  
		
		for(int i=0; i<newStrArray.length;i++) {
			System.out.println(newStrArray[i]);
		}
	}

}
