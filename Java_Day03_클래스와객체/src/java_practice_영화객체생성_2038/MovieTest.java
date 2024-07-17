package java_practice_영화객체생성_2038;

public class MovieTest {
	public static void main(String[] args) {
		// 기본 생성자를 통해 사용자 객체 생성
		Movie movie1 = new Movie();
		movie1.id = 2;
		movie1.title = "설국열차";
		movie1.director = "봉준호";
		movie1.genre = "드라마";
		movie1.runningTime = 136;

		// 객체 생성과 동시에 멤버 변수를 초기화 하는 생성자 호출
		Movie m = new Movie(1, "기생충", "봉준호", "드라마", 128);
		
		
		System.out.println(movie1.title);

		System.out.println(m.title);


	}
}
