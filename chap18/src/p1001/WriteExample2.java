package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		//OutputStream의 약자 os
				OutputStream os = new FileOutputStream("C:/Temp/test.txt");
				byte[] data = "이건 무슨 상황인가??".getBytes();
				os.write(data);
				//os.write(data,2,3); 이사하게 출력되는데
				os.flush();
				os.close();
			}
	}


