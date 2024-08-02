package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {
		/*
		 * [문제 5] 3개의 Book 객체를 배열로 생성하여 각각의 정보와 할인된 가격을 출력한다. 배열에 있는 객체 정보는 모두 getter로
		 * 출력한다. (for문 이용)
		 * 
		 * <사용 데이터> title : 자바의 정석 열혈강의 자바 객체지향 JAVA8 author : 남궁성 구정은 금영욱 price : 30000
		 * 29000 30000 publisher : 도우출판 프리렉 북스홈 discountRate : 0.1 0.1 0.1
		 */

		Book bArray[] = new Book[3];
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);

		for (int i = 0; i < bArray.length; i++) {
			System.out.print(bArray[i].getTitle() + ", ");
			System.out.print(bArray[i].getAuthor() + ", ");
			System.out.print(bArray[i].getPublisher() + ", ");
			System.out.print(bArray[i].getPrice() + "원, ");
			System.out.print((int) (bArray[i].getDiscountRate() * 100) + "% 할인\n");
			System.out.println("할인된 가격 : " + bArray[i].getTotal() + "원\n");
		}

	}

}
