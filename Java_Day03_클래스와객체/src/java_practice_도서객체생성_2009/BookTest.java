package java_practice_도서객체생성_2009;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book("21424","Java Pro","김하나","jaen.kr",15000, "Java 기본 문법");
		Book book2 = new Book("35355","분석설계","소나무","jaen.kr",30000, "SW 모델링");
		
		System.out.println("**********************도서목록********************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
	}
}

