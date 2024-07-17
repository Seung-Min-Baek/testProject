package java_practice;

import java.util.Scanner;

public class java_몇번째날인지구하기_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("월과 일을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int allday = 0;
		for (int i = 1; i < month; i++) {
			if (i==1 || i==3 || i==5 ||i==7||i==8||i==10 ||i==12) {
				int countday = 31;
				allday += countday;
			}else if (i == 4 || i == 6 || i==9 || i ==11) {
				int countday = 30;
				allday += countday;
			} else {
				int countday = 28;
				allday += countday;
			}
		}
		allday += day;
		System.out.printf("%d월 %d일은 %d번째 날입니다.",month,day,allday);
	}

}
