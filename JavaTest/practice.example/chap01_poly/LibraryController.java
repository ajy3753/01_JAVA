package chap01_poly;

public class LibraryController {
	// 변수 (mem : null로 명시초기화, bList : 크기 5 할당)
	private Member mem = new Member();
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	// 기본 생성자
	public LibraryController() {
	}

	// 회원 등록
	public void insertMember(Member mem) {
		this.mem = mem;
	}

	// 마이페이지 정보 리턴
	public Member myInfo() {
		return this.mem;
	}

	// 전체 도서 목록 리턴
	public Book[] selectAll() {
		return bList;
	}

	// 도서 검색 결과 리턴
	public Book[] searchBook(String keyword) {
		Book[] searchList = new Book[5];
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				searchList[count++] = bList[i];
			}
		}
		return searchList;
	}

	// 도서 대여 판별 리턴
	public int rentBook(int index) {
		int result = 0;

		// 만화책일 경우
		if (bList[index].toString().contains("AniBook")) {
			if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		}
		// 요리책일 경우
		else {
			if (((CookBook) bList[index]).getCoupon() == true) {
				int count = mem.getCouponCount();
				count++;
				mem.setCouponCount(count);
				result = 2;
			}
		}

		return result;
	}
}
