package java_practice_게시판객체생성실습_2040;

import java.util.Date;

public class Article {
	int articleId;
	String title;
	String content;
	int userSeq;
	int viewCnt;
	Date regDate;
	
	Article(){
		
	}
	Article(int articleId, String title, String content, int userSeq, int viewCnt, Date regDate){
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.userSeq = userSeq;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", content=" + content + ", userSeq=" + userSeq
				+ ", viewCnt=" + viewCnt + ", regDate=" + regDate + "]";
	}
	
	
}
