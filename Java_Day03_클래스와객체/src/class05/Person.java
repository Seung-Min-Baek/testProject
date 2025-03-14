package class05;

// 클래스 생성 : class 키워드 이용
// class 클래스이름 {}
class Person {
	// 데이터
	// 멤버 변수
	String name;
	int age;
	String hobby;
	
	// 관련된 데이터와 로직을 하나로 묶어준다.
	// 멤버 메서드
	// 멤버 변수는 객체(인스턴스) 자기 자신이 가지고 있는 것이므로
	// 굳이 매개변수로 넘기지 않아도 접근 가능.
	// static : 클래스(설계도)
	void info() {
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"세입니다.");
		System.out.println("취미는 " +hobby+"입니다.");
	}
}
