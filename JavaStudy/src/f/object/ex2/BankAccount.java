package f.object.ex2;

public class BankAccount {
	// 필드 영역
	int balance = 0;

	// 메소드 영역
	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

	public void checkMyBalance(int balance) {
		/*
		 * 영역 안에서 변수를 찾을 때는 가장 작은 단위부터 탐색한다. 지역변수 우선 -> 이후에 필드값 this 키워드 사용시 접근한 객체의
		 * 필드값을 가져올 수 있다. => this가 없으면 지역변수인 int balance의 값이 출력된다
		 */
		System.out.println("잔액 : " + this.balance);
	}
}
