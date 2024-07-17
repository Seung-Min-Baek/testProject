
public class Array01_배열의선언과생성 {
	public static void main(String[] args) {

		// 배열의 선언
		int[] arr1; // 이것을 권장함.
		int arr2[];
		// 배열이 실제로 만들어진 것은 아니고, 참조값을 저장할 변수를 만든 것임

		// 배열의 생성
		// 1.자료형[] 변수이름 = new 자료형[길이];
		int[] arr3 = new int[5];

		// 2. 자료형[] 변수이름 = new 자료형[] { 값1, 값2, ...};
		int[] arr4 = new int[] { 1, 2, 3, 4 };

		// 3. 자료형[] 변수이름 = {값1, 값2, 값3, ...};
		// - 제약 사항이 있다.
		int[] arr5 = { 1, 2, 3, 4, 5 };

		// 재할당
		arr3 = new int[0];
		arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
//		arr3={1,2,3,4,5,6,7}; 선언과 동시에만 쓸 수 있다.
		
		// 배열의 요소에 접근할 때
		//배열이름 + index
		arr3[4] = 10;
		arr3[5] = 20;
//		arr3[100] = 30; 실행 중에 나타나는 예외(런타임 예외)
		
		// 이클립스에서 소스코드를 저장할 때
		// 저장하는 순간 컴파일이 일어남. => 컴파일 과정에서 예외가 발생하면 빨간줄로 알려줌
		// 
	}
}
