package list;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
	private Music m = new Music();
	private List list = new ArrayList();
	
	// 메소드
	public int addList(Music music) {
		// 마지막 리스트에 객체 저장, 1 리턴
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		// 첫 번째 리스트에 객체 저장, 1 리턴
		return 1;
	}
	
	
	public List printAll() {
		return null;
	}
	
	public Music searchMusic(String title) {
		return null;
	}
	
	public Music removeMusic(String title) {
		return null;
	}
	
	public Music setMusic(String title, String music) {
		return null;
	}
	
	public int ascTitle() {
		return 0;
	}
	
	public int descSinger() {
		return 0;
	}
}
