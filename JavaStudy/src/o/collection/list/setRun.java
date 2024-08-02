package o.collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class setRun {
	public static void main(String[] args) {
		/*
		 * Object에 equals() => 두 객체의 "주소값"을 비교해서 일치하면 true, 일치하지 않으면 false 반환
		 * Object에 hashCone() => 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		 */
		
		HashSet hsi = new HashSet();
		
		/*
		 * 저장 순서를 유지하지 않는다. 중복된 데이터(동일객체) 보관 불가
		 * String에 equals() 오버라이딩 => "실제 담긴 문자열"을 가지고 동등비교를 진행해서 일치하면 true, 일치하지 않으면 false
		 * String에 hashCode() 오버라이딩 => "실제 담긴 문자열"을 가지고 10진수의 형태로 만들어서 반환
		 */
		hsi.add("hello");
		hsi.add("world");
		
		System.out.println(hsi);

		// 동일 객체 : 각 개체마다 hashCode() 결과가 일치하고, equals 메소드로 비교시 true가 나올 때
		// hsi.get() : 인덱스의 개념이 없기 때문에 get을 할 수 없음 -> 한 개씩 무작위로 가져올 수 있음
		
		// HashGet에 담긴 모든 객체들을 순차적으로 접근하는 방법
		// 1. for문 이용
		for(Object s : hsi) {
			System.out.println(s);
		}
		
		// 2. Interator 반복자를 이용해서 순차적 접근 방법
		Iterator it = hsi.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// 3. ArrayList에 담아준 다음 그 ArrayList를 반복적으로 돌아가며 접근
		ArrayList list = new ArrayList();
		list.add(hsi);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)                          );
		}
	}
}
