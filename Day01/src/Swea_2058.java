import java.util.Scanner;

public class Swea_2058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 3; i >=0 ; i--) {
			double exp = Math.pow(10, i);

			double num = N / exp;
			int one = (int)num;

			N -= one * exp;

			sum += one;

		}
		System.out.println(sum);

	}

}
