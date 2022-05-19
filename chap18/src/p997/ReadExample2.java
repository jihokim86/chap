package p997;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("c:/temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		while(true){
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
				data += new String(readBytes,0,readByteNo);
		}
		System.out.println(data); // 한글은 읽는건 못함~~ 한글을 읽기위해서는 Reader를 사용해야함
		is.close();
	}

}


