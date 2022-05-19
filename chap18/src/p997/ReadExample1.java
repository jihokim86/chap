package p997;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	public static void mian(String[] agrs) throws Exception{
		
		InputStream is = new FileInputStream("c:/temp/test.txt");
		
		int readByte;
		
		while(true) {
			readByte = is.read();
			if(readByte==-1) {
				break;
			}
				System.out.print((char)readByte);
			}
		is.close();
		}
	}

