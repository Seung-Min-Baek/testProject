package java_practice_상품리뷰객체생성_2036;

public class Review {
	
	int reviewId;
	String pCode;
	String writer;
	String content;
	
	Review(){
		
	}
	Review(int reviewId, String pCode, String writer, String content){
		this.reviewId = reviewId;
		this.pCode = pCode;
		this.writer = writer;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", pCode=" + pCode + ", writer=" + writer + ", content=" + content
				+ "]";
	}
	
	
}
