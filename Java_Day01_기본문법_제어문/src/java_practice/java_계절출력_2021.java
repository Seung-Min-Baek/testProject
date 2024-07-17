package java_practice;

import java.util.Scanner;

public class java_계절출력_2021 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("월 입력>>");
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
			if (month>=3 && month<6) {
				System.out.printf("%d월은 봄입니다.\n",month);
			}else if (month>=6 && month<9) {
				System.out.printf("%d월은 여름입니다.\n",month);
			}else if (month>=9 && month<12) {
				System.out.printf("%d월은 가을입니다.\n",month);
			}else {
				System.out.printf("%d월은 겨울입니다.\n",month);
			}
			
		}
	}
}
