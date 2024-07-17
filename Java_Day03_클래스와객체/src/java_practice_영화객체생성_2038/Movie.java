package java_practice_영화객체생성_2038;

public class Movie {

	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	Movie(){
		
	}
	
	Movie(int id, String title, String director, String genre, int runningTime){
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
}
