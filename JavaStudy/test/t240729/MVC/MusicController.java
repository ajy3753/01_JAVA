package t240729.MVC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicController {
	// 필드
	private List list = new ArrayList();
	
	// 메소드
	public int addList(Music music) {
		return 0;
	}
	
	public int addAtZero(Music music) {
		return 0;
	}
	
	public List printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		return null;
	}
	
	public Music removeMusic(String title) {
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		return null;
	}
	
	public int ascTitle() {
		// Collectiona.sort : 컬력션에서 정렬 기능을 제공하는 메소드
		// 정렬하고 싶은 컬렉션 개체와 정렬 기준을 정한 객체(Comparator 구현한 객체)를 전달하면
		// 정렬 기준에 맞춰 정렬을 수행해준다.
		//Collections.sort(list, nes AscTitle());
		return 0;
	}
	
	public int descSinger() {
		return 0;
	}
}
