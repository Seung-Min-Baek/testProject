
public class Start_06_반복문 {

	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		
//		// index 0
//		int[] intArray = {1,2,3,4,5};
//		for (int i : intArray) {
//			i = 999;
//		}
//		// 출력 시 i로 배열 값을 바꾸진 않는다.
//		// 값을 할당해도 의미가 없다.
//		
//		
//		for (int i : intArray) {
//			System.out.println(i);
//		}
//		
//		int num = 1;
//		
//		while (num <5) {
//			System.out.println(num++); // 증감식 꼭 필요
//		}
//		
//		do {
//			System.out.println(num);
//		} while(num >5); {
//			
//		}
//		

		// 1. 1부터 10까지 숫자 출력
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 2. 1부터 10까지 중 짝수만 출력
		
		for (int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			if (i %2 !=1) {
				continue;
			}
			System.out.println(i);
		}
		// 3. 구구단을 5단까지 출력
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x "+ j + " = " + i*j);
			}
		}
	}

}
