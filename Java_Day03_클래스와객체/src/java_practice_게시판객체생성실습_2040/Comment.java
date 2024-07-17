package java_practice_게시판객체생성실습_2040;

import java.util.Date;

public class Comment {
	int commentId;
	int articleId;
	int userSeq;
	String content;
	Date regDate;
	
	Comment(){
		
	}
	Comment(int commentId, int articleId, int userSeq, String content, Date regDate){
		this.commentId = commentId;
		this.articleId = articleId;
		this.userSeq = userSeq;
		this.content = content;
		this.regDate = regDate;
		
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", articleId=" + articleId + ", userSeq=" + userSeq + ", content="
				+ content + ", regDate=" + regDate + "]";
	}
	
}
