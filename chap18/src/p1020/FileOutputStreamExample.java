package p1020;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:\\Temp\\test.hwp";
		
		String targetFilename = "C:\\target\\test.hwp";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFilename);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while( (readByteNo=fis.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		  
		System.out.println("복사가 완료 되었습니다.");
	}
}
