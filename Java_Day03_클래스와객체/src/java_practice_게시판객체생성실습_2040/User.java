package java_practice_게시판객체생성실습_2040;

public class User {
	
	int userSeq;
	String userId;
	String password;
	String userName;
	String nickName;
	String email;
	
	User(){
		
	}
	User(int userSeq, String userId, String password, String userName, String nickName, String email){
		this.userSeq = userSeq;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
		this.email = email;
		
	}
	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", userId=" + userId + ", password=" + password + ", userName=" + userName
				+ ", nickName=" + nickName + ", email=" + email + "]";
	}
	
}
