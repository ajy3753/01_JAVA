package l.io.ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  "바이트 스트림"을 통한 입출력 해보기
 *  - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로 -> 한글깨짐)
 *  - 기반 스트림
 *  
 *  xxxInputStream : xxx 매체로부터 데이터를 입력 받는 통로 (외부로부터 데이터를 읽어오겠다)
 *  xxxOuptStream : xxx 매체로부터 데이터를 출력하는 통로 (외부 매체로 데이터를 내보내겠다)
 */
public class FileSave {
	
	public void fileRead() {
		// 1. 스트림 생성
		// 2. 스트림을 통해서 입력 받음
		// 3. 사용이 끝난 스트림 반납
		
		FileInputStream fin = null;
		
		try {
			// 1. 스트림 생성
			fin = new FileInputStream("byte_test.txt");
			
			// 2. 파일로부터 데이터를 읽어들이고자 할 때 read 메소드 사용
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());	// 파일을 끝을 만나는 순간 -1을 반환한다
			
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.print((char)value);
			}
			
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
