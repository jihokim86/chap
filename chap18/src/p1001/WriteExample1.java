package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		//OutputStream의 약자 os
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "이건 무슨 상황인가??".getBytes();
		for(int i =0; i<data.length;i++) {
			os.write(data[i]);
			System.out.print(data[i]); //문자의 코드 출력됨
		}
		os.flush();
		os.close();
	}

}
