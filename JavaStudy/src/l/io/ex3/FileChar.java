package l.io.ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileChar {
	/*
	 * "문자 기반 스트림"을 활용하여 입출력
	 * - 문자 기반 스트림 : 데이터를 2바이트 단위로 전송하는 통로
	 * - XXXReader : 입력용 스트림
	 * - XXXWriter : 출력용 스트림
	 */
	
	public void fileSave() {
		// 1. 객체 생성
		try (FileWriter fw = new FileWriter("char_test.txt");) {
			// 2. write 메소드를 활용하여 데이터 출력
			fw.write("정말정말 졸려 디지겠다.");
			fw.write("\n");
			fw.write("집에 보내줘");
			
			char[] arr = {'자', '고', '싶', '다'};
			fw.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try (FileReader fr = new FileReader("char_test.txt");) {
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
