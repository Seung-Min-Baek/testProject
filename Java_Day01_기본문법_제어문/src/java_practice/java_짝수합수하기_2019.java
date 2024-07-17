package java_practice;

import java.util.Scanner;
public class java_짝수합수하기_2019 {
	public static void main(String[] args) {
		System.out.print("숫자 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int ans =0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				ans +=i;
			}else 
				continue;
			
		}
		System.out.printf("1부터 10까지 수 중 짝수의 합 = %d",ans);
	}
}
