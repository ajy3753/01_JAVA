package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	// File 객체를 생성하는 매개변수가 있는 생성자에 file을 매개변수로 넘겨주고, 해당 파일이 있는 지 없는 지에 대한 boolean 값을 반환
	public boolean checkName(String file) {
		try {
			FileInputStream check = new FileInputStream(file);
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}
	
	// 매개변수로 들어온 file을 파일명으로 이용하여 파일을 만들어주고 String을 써서 저장
	public void fileSave(String file, String s) {
		try(FileWriter fw = new FileWriter(file);) {
			fw.write(s); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 매개변수로 받은 파일명을 이용하여 저장되어 있는 데이터 반환
	public StringBuilder fileOpen(String file) {
		StringBuilder openSB = new StringBuilder();
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str = "";
			
			while((str = br.readLine()) != null) {
				openSB.append(str + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return openSB;
	}
	
	// 매개변수로 받은 파일명에 문자열 저장
	public void fileEdit(String file, String s) {
		try(FileWriter fw = new FileWriter(file);) {
			fw.write(s); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
