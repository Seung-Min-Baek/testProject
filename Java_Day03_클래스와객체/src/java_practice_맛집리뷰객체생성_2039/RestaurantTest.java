package java_practice_맛집리뷰객체생성_2039;

public class RestaurantTest {
	public static void main(String[] args) {
		System.out.println("****************맛집목록***************");
		Restaurant res1 = new Restaurant(101,"을밀대","서울","냉면", 4);
		Restaurant res2 = new Restaurant(401,"도마29","대구","연어초밥", 3);

		System.out.println(res1.toString());
		System.out.println(res2.toString());
		
		System.out.println("****************리뷰목록***************");
		Review review1 = new Review(1,101,"김싸피","너무 맛있네요.");
		Review review2 = new Review(2,401,"나싸피","연어초밥은 여기가 최고!");
		
		System.out.println(review1.toString());
		System.out.println(review2.toString());
	}
}
