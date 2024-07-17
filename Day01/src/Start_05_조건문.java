import java.util.Scanner;

public class Start_05_조건문 {

	public static void main(String[] args) {
		System.out.println("첫번째");
		if(false)
		System.out.println("첫번째");
		System.out.println("첫번째");
		
		
		// ctrl + alt + 방향키 아래 -> 복사
		//  alt + 방향키 -> 코드이동
		// ctrl + d -> 한줄 지우기
		// ctrl + shift + f -> 줄맞춤
		
		
		// Scanner를 사용하여 입력받은 수가 짝수일때만 출력되는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		if (num % 2 ==0){
//			System.out.println(num + "는 짝수");
//		} else {
//			System.out.println(num + "는 홀수")
//		}
//		
//		
		
		// 80점 이상 : A
		// 60점 이상 : B
		// 그 밖 : C
//		if (num >= 80) {
//			System.out.println("A");
//		} else if (num >= 60) {
//			System.out.println("B");
//		} else {
//			System.out.println("C");
//		}
		
		switch (num) {
		case 80:
			System.out.println("80점입니다.");
			break;
		case 60:
			System.out.println("60점입니다.");
			break;
		default:
			System.out.println("그 밖의 점수입니다.");
			break;
		}
	}

}
