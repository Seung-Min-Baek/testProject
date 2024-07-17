package java_practice;

import java.util.Scanner;

public class java_스위치온오프_2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] num = new int[M];
		int[] swtch = new int[N];
		for (int i = 0; i < M; i++) {
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < swtch.length; j++) {
				while (num[i]*j < 10) {
					if (swtch[num[i]*j-1]==0) {
						swtch[num[i]*j-1]=1 ;
					}else {
						swtch[num[i]*j-1]=0 ;
					}
					j++;
				}
			}
		}
		for (int i = 0; i < swtch.length; i++) {
			
			System.out.printf(swtch[i]+" ");
		}
	}
}
