package t240709.practice1;

import java.util.Scanner;

public class RunMember {

	public static void main(String[] args) {
		// Member : memberId, memberPwd, memberName, age, gender, phone, email
		Member user = new Member("hoidulli", "1234", "둘리", 20, '남', "010-0000-0000", "hoihoi@ice.net");
		
		// change()Name으로 이름 변경 후 printName() 이용해 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 이름 입력 : ");
		String changeName = sc.next();
		user.changeName(changeName);
		
		sc.close();
		
		// 전체 출력도 해보기
		user.infomation();
	}

}
