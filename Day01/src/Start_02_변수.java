
public class Start_02_변수 {

	public static void main(String[] args) {
		// int 
		int number = 0; 
				
		
		number = 2;
				
		//상수
		final int STUDENT_NUMBER = 0;
				
		//final은 값이 한 번 할당되면 변경될 수 없음
//		STUDENT_NUMBER = 3;
				 
		// 변수명 -> a, b, x, y;
		 // 변수 이름이 어려우면 유지보수에 곤란해짐
		// 변수는 어떠한 의미를 가진 이름으로 설정하기
		// 주석 상세하게 적기 습관화 ( 이 코드가 어떤 프로그램 코드인지 / 이 변수가 어떠한 변수인지)
				 
		//주석
		// 1. 한줄주석
		long number2=1;
		// 슬래쉬 두개
		// ctrl + /
		// ctrl + 7
				 
		 // 2. 여러줄 주석
		/*long number3 = 2*/
		// ctrl + shift + /
				 
		// 3. document 주석
		/**
		* 주석문
		*/
				 
		test();
				 
		 // 1. CamelCase :  첫번째 글자 소문자, 그 다음 단어는 대문자로 시작
		int studentNumber;
		// 변수명, 메서드명
				 
		// 2. snake_case
		int student_number;
				 
		// 3. PascalCase :  첫번째 글자를 대문자로
		int StudentNumber;
		// 클래스 이름 등에서 사용
				 
		// 4. kebab-case
				 
		// String -> 문자형
		// 객체 -> 레퍼런스타입
		// -> 주소값만 저장
		Student st1 = new Student();
		Student st2 = new Student();
		
		System.out.println(st1 == st2);
		
		
		// String
		// char형 배열 -> 데이터를 저장
		// + 문자열을 처리하기 위한 다양한 메서드들
		
		// 불멸성
		String studentName1 = "abc";
//		studentName1 = "zbc";
		
		// String Constant pool
		// JVM이 메모리를 효율적으로 사용하기 위해 저장
		
		String studentName2 = "abc";
		
		System.out.println(studentName1 == studentName2);
			
		// String 속도가 느려지는 경우가 있음
		// StringBuffer, StringBuilder
			
			
			}
			
			/**
			 * test 주석문
			 */
	public static void test() {
		
	}
	public static class Student{
		
	}

}
