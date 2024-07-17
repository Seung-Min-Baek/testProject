package java_practice_게시판객체생성실습_2040;

import java.util.Date;

public class BoardTest {
	public static void main(String[] args) {
		System.out.println("User 출력");
		System.out.println("----------------------------");
		
		User ssafy = new User(0,"ssafy","1234","김싸피","김싸피","ssafy@ssafy.com");
		User hong = new User(1,"hong","123","홍싸피","ssafy.hong","hong@ssafy.com");
		User samsic = new User(2,"samsic","samsic","김삼식","삼식이","kim@ssafy.com");
		User happy = new User(3,"happy","happy","이싸피","해피바이러스","lee@ssafy.com");
		
		System.out.println(ssafy.toString());
		System.out.println(hong.toString());
		System.out.println(samsic.toString());
		System.out.println(happy.toString());

		System.out.println("게시글");
		System.out.println("----------------------------");
		
		Article id0 = new Article(0,"공지사항","게시글 내용",0,0,new Date(System.currentTimeMillis()));
		Article id1 = new Article(1,"코딩테스트란","게시글 내용",1,0,new Date(System.currentTimeMillis()));
		Article id2 = new Article(2,"취뽀는 나에게","게시글 내용",2,0,new Date(System.currentTimeMillis()));
		Article id3 = new Article(3,"완전정복","게시글 내용",3,0,new Date(System.currentTimeMillis()));
		
		System.out.println(id0.toString());
		System.out.println(id1.toString());
		System.out.println(id2.toString());
		System.out.println(id3.toString());
		
		System.out.println("게시글 댓글 출력");
		System.out.println("----------------------------");
		
		Comment comment1 = new Comment(0,1,5,"잘 보았습니다.",new Date(System.currentTimeMillis()));
		Comment comment2 = new Comment(1,1,4,"좋은 글 입니다~~",new Date(System.currentTimeMillis()));
		
		
		System.out.println(comment1.toString());
		System.out.println(comment2.toString());

	
	
	
	}
}
