package l.io.ex1;

import java.io.File;
import java.io.IOException;

public class Run {
	/*
	 * 간단하게 파일을 만들어보자
	 * java.io.File 클래스를 가지고
	 */
	public static void main(String[] args) {
		// 1. 경로 지정을 딱히 하지않고 파일 생성하기
		File f1 = new File("test.txt");	// 파일 객체를 하나 만든 상태 (실제 파일x)
		
		// 2. 존재하는 폴더에 파일 생성
		File f2 = new File("D:\\text2.txt");
		
		// 3. 존재하지 않는 경로에 파일 생성
		// 존재하지 않는 경로로 생성 시 예외 발생 -> IOExeption
		//File f3 = new File("D:\\tmp\\text.txt");
		
		// 3. 폴더 먼저 만들고 파일 만들어지게 하는 방법
		File tmpFoler  = new File("D:\\tmp");
		File f3 = new File("D:\\tmp\\test.txt");
		
		try {
			// createNewFile 메소드가 실행될 때 실제 파일이 만들어짐
			f1.createNewFile();
			f2.createNewFile();
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 파일의 존재 유무를 코드로 확인할 수 있다.
		System.out.println(f1.exists());
	}
}
