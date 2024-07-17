package java_practice_2차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class java_사과나무영양분구하기_2032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// +모양으로 순환하면서 최대값 구하기
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, 1, -1 };
		
		int num = 0;
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				int sum = 0;
				for (int i = 0; i < 4; i++) {
					int nr = r + dr[i];
					int nc = c + dc[i];
					if (nr >= 0 && nc >= 0 && nr < N && nc < N) {
						sum +=arr[nr][nc];
					}
				}
				sum +=arr[r][c];

				if (sum>num) {
					num = sum;
				}
			}
			
		}
		System.out.println(num);
	}
}
