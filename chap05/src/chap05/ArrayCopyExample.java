package chap05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// System.arraycopy�� �̿��� �迭 ����
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
//System.arraycopy(Object src,int srcPos, Object dest,int destPos,int length)
//Object src : ���� �迭
//int srcPos : ���� �迭���� ������ �׸��� ���� �ε���
//Object dest : ���ο� �迭
//int destPis : ���ο� �迭���� �ٿ����� ���� �ε���
//int length : ������ ����  
		
		for(int i=0; i<newStrArray.length;i++) {
			System.out.println(newStrArray[i]);
		}
	}

}
