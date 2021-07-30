package lesson003;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest1 {

	public static void main(String[] args) {
		try {FileReader fr = new FileReader("c:/user/shin/temp/input.txt");
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
	}
}catch (FileNotFoundException fe) {
	System.out.println("지정된 파일을 찾을 수 없습니다.");
	catch (IOException e) 
	
	// TODO: handle exception
	System.out.println("파일 입출력 처리 오류");
	e.printStackTrace();
	System.out.println("프로그램 정상종료...");
}


	}


