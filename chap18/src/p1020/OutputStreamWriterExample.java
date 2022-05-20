package p1020;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 ㅁ누자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
	}

}
