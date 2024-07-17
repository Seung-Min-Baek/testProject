import java.util.Scanner;

public class Start_04_연산자 {

	public static void main(String[] args) {
		// 증감연산자
		int number = 1;
		System.out.println(++number);
		System.out.println(number++);
		System.out.println(number);
		
		//나눗셈
		System.out.println(10/3);
		//몫
		
		//modulo 연산자
		System.out.println(10%3);
		//나머지값
		
		//bit shift 연산자
		System.out.println(1 << 1);
		System.out.println(2 << 1);
		System.out.println(3 << 1);
		
		// 비교연산
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		System.out.println(a != b);
		
		// AND -> &&
		// true and true -> true
		// true and false -> false
		// false and true -> false
		// false and false -> false
		
		// OR -> ||(파이프 연산자)
		// true or true -> true
		// true or false -> true
		// false or true -> true
		// false or false -> false
		
		// 단축연산
		
		
		Scanner sc = new Scanner(System.in); // system.in : 키보드 등의 입력장치로부터 입력받는것
		
		final double PI = 3.14;
		double inputR = sc.nextDouble();
		// 원넓이 -> 반지름^2 * 파이값
		double result = (inputR * inputR) * PI;
		
		System.out.println(result); // system.out : 콘솔 창에 출력
		
		
		
		
		
		
	}

}
