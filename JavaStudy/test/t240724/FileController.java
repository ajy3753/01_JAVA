package t240724;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	// 필드
	// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public boolean checkName(String file) {
		return true;
	}
	
	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileSave(String file, String s) {
		fd.fileSave(file, s);
	}
	
	// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public StringBuilder fileOpen(String file) {
		fd.fileOpen(file);
		return null;
	}
	
	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileEdit(String file, String s) {
		
	}
}
