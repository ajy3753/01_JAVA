package a.basic;

public class Output {
	public static void main(String[] args) {
		// println : 한 줄을 출력하고 개행을 한다.
		System.out.println("안녕하세요.");
		System.out.println("안지윤입니다.");

		// print : 단순하게 출력을 할 대 사용하는 출력문(개행x)
		// \n : print에서 개행을 하고 싶을 때 쓰는 문자
		System.out.print("안녕하신가\n");
		System.out.print("친애하는 동지들과 원수들이여.\n");

		// System.out.printf(문자열포맷, 값1, 값2);
		/*
		 * 포맷 안에서 쓸 수 있는 키워드 %d : 정수 %c : 문자 %s : 문자열 %f : 실수 (소수점 아래로 원하는만큼 표시하기 위해서는
		 * %.nf)
		 */
		String name = "원 투 쓰리 포";
		System.out.printf("안녕하세요 저는 %s입니다.\n", name);
		System.out.printf("제 이름은 %s입니다. 나이는 %d이고 키는 %.1f입니다.", "짱구", 20, 100.6);
	}
}
