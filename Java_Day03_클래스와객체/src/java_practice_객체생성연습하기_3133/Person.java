package java_practice_객체생성연습하기_3133;

public class Person {
	
	/* 멤버 변수 (필드) 생성하기 */
	
	// Q. 사람의 정보를 저장하기 위한 변수를 생성해 봅시다.
	//    이름은 문자열, 나이는 정수형, 키는 실수형, 취미는 문자열 타입으로 선언합니다.

	String name;
	int age;
	double height;
	String hobby;	
	
	/* 기본 생성자 생성하기 */
	
	/*
	 * 임의의 데이터가 없는 경
	 * 우 기본 생성자가 호출됩니다.
	 * 기본 생성자는 생략할 수 있습니다.
	 * 
	 */
	
	Person() {
		
	}
	
	
	/* 파라미터 생성자 생성하기 */
	
	/*
	 * 임의의 데이터를 포함하여 객체를 생성해야하는 경우에 사용할 수 있는 생성자 입니다.
	 * 파라미터 생성자를 생성한 경우에는 기본 생성자를 작성하지 않으면 기본 생성자를 사용할 수 없습니다.
	 *  
	 */
	
	// 객체를 생성할때 호출할 생성자, 외부에서 이름, 나이, 키, 취미 정보를 받아와서 사용합니다.
	Person(String name, int age, double height, String hobby) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.hobby = hobby;
	}
	
	/* 멤버 메소드 생성하기 */
	
	// Q. 객체에 저장된 멤버 변수를 출력하기 위한 코드를 작성해 봅시다.
	void showInformation() {
		System.out.println("저의 이름은 " + name + "입니다.");
		System.out.println("저의 나이는 " + age + "살 입니다.");
		System.out.println("저의 키은 " + height + "cm 입니다.");
		System.out.println("저의 취미은 " + hobby + "입니다.");
	}
}
