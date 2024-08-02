package t240705;

import java.util.Scanner;

public class T_12 {

	public static void main(String[] args) {
		/*
		 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요.
		 * 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정되도록 하고,
		 * 사용자에게는 직접 가위 바위 보를 받으세요.
		 * 사용자가 "exit"를 입력하기 전까지 가위바위보를 진행하고
		 * "exit"가 들어오면 반복을 멈추고 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		int cnt = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		String[] attack = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("\n가위바위보 : ");
			String user = sc.next();
			
			if(user.equals("exit")) {
				break;
			}
			
			switch(user) {
			case "가위" :
				break;
			case "바위" :
				break;
			case "보" :
				break;
			default :
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			int random = (int)(Math.random() * 3 + 0);
			String com = attack[random];
			
			System.out.println("컴퓨터 : " + com);
			System.out.println(name + " : " + user);
			
			if(user.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			}
			else if(user.equals("가위") && com.equals("보")
					|| (user.equals("보") && com.equals("주먹"))
					|| (user.equals("주먹") && com.equals("가위"))
					) {
				System.out.println("이겼습니다!");
				win++;
			}
			else {
				System.out.println("졌습니다...ㅠㅠ");
				lose++;
			}
			
			cnt++;
		}
		
		System.out.printf("%d전 %d승 %d무 %d패", cnt, win, draw, lose);

	}

}
