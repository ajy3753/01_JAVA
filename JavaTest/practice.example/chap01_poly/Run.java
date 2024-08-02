package chap01_poly;

public class Run {
	public static void main(String[] args) {
		/*
		 * [다형성 실습문제] 도서대여 관련 프로그램으로 다형성을 적용한 프로그램이다. 해당 구현 클래스 다이어그램과 클래스 구조를 참고하여
		 * 프로젝트를 완성하시오. 1. 프로그램이 실행되면 회원의 인적 사항을 입력하고, 회원등록을 한다. 2. 메뉴가 출력되면서 마이페이지,
		 * 도서전체조회, 도서검색, 도서대여가 나타난다. 3. 도서를 대여할 때 - 만화책인 경우 : 회원 나이와 만화책의 제한 나이를 비교하여 대여
		 * 가능 여부를 판별한다. - 요리책인 경우 : 해당 도서에 요리학원 쿠폰이 있으면 쿠폰이 함께 발급된다.
		 * 
		 * <사용 데이터> [title] [author] [publisher] [accessAge] [coupon] 백종원의 집밥 백종원 tvN
		 * true 한번 더 해요 미티 원모어 19 루피의 원피스 루피 japan 12 이혜정의 얼마나 맛있게요 이혜정 문학 false 최현석 날
		 * 따라해봐 최현석 소금책 true
		 */

		LibraryMenu m = new LibraryMenu();
		m.mainMenu();
	}
}
