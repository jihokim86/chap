package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABCD".getBytes(); //긴 문자열를 넣으면 이상하게 출력됨
		os.write(data,0,3); 
		os.flush();
		os.close();
	}
}
