import java.util.Scanner;

public class Swea_2072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] numArr = new int[10];
		
		for (int test_case = 1; test_case < T+1; test_case++) {
			
			int sum = 0;
			
			for (int i = 0; i < 10; i++) {
				numArr[i] = sc.nextInt();

				if (numArr[i] % 2 == 1) {
					sum += numArr[i];
				}
				else {
					continue;
				}
			}
			System.out.println("#"+test_case+" "+sum);
		}

	}

}
