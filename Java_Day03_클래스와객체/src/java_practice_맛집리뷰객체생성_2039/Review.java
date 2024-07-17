package java_practice_맛집리뷰객체생성_2039;

public class Review {

	int reviewid;
	int resid;
	String writer;
	String content;
	
	Review(){
		
	}
	
	Review(int reviewid, int resid, String writer, String content){
		this.reviewid = reviewid;
		this.resid = resid;
		this.writer = writer;
		this.content = content;
		
	}

	@Override
	public String toString() {
		return "Review [reviewid=" + reviewid + ", resid=" + resid + ", writer=" + writer + ", content=" + content
				+ "]";
	}

}
