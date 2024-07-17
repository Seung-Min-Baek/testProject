package java03_operator;

public class Op05_삼항연산자 {
    public static void main(String[] args) {
        // 삼항연산자
        // 조건식? 식1(참) : 식2(거짓)
        
        //랜덤 숫자 발생기 
        int num = (int) (Math.random() * 10) + 1;
        
//        Math.random() : 0보다 크거나 같고 1보다 작은 숫자 반환
//        num : 1<=    <=10인 수 출력
        // num이 홀수인지 짝수인지.
        System.out.println(num);
        System.out.println(num % 2 == 0 ? "짝" : "홀");
    }
}
