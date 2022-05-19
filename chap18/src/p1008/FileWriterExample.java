package p1008;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterExample {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("C:/temp/test.txt");
		char[] data = "홍길동".toCharArray();
		for(int i=0;i<data.length;i++) {
		writer.write(data[i]);
		}
		//writer.write(data,1,2);
		writer.flush();;
		writer.close();
	}
}
