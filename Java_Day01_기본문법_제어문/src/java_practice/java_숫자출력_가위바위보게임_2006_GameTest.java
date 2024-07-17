package java_practice;

import java.util.Scanner;

public class java_숫자출력_가위바위보게임_2006_GameTest {
	public static void main(String[] args) {
		
		// 번호 고르기
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1.5판 3승");
		System.out.println("2.3판 2승");
		System.out.println("3.1판 1승");

		System.out.print("번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		int gamenum = 0;
		if (choose == 1) {
			gamenum = 5;
		} else if (choose == 2) {
			gamenum = 3;
		} else if (choose == 3) {
			gamenum =1;
		}
		
		int usernum = 0;
		int comnum = 0;
		
		for (int i = 0; i < gamenum; i++) {
				
			// 사용자 입력
			System.out.print("가위바위보 중 하나 입력:");
			String game = sc.next();
//			System.out.println(game);
				
			int user = 0;
			if (game.equals("가위")) {
				user = 1;
			}else if (game.equals("바위")) {
				user = 2;
			}else{
				user = 3;
			}
				
				// 난수 발생 코드
				
			int num = (int) (Math.random()*3)+1;
			System.out.println(num);
			System.out.println(user);
				
				
			// 사용자 vs 난수
				//  사용자 win
			if (user>num) {
				System.out.println("이겼습니다!!!");
				usernum += 1;
			} else if(user==1 && num==3) {
				System.out.println("이겼습니다!!!");
				usernum += 1;				
			} else if (user == num) {
				System.out.println("비겼습니다!!!");
			} else {
				System.out.println("졌습니다!!!");
				comnum += 1;
			}
			
			System.out.println(usernum);
			System.out.println(comnum);
			if (usernum==(gamenum/2+1)) {
				System.out.println("### 사용자 승!!!");
				System.exit(0);
			} else if (comnum==(gamenum/2+1)) {
				System.out.println("### 컴퓨터 승!!!");
				System.exit(0);
			}
			
		}
		System.out.println("### 컴퓨터 승!!!");
	}
}
