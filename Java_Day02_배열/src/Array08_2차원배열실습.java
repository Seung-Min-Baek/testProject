
public class Array08_2차원배열실습 {
	public static void main(String[] args) {
		int[][] grid = {
				{ 2, 3, 1, 4, 7 }, 
				{ 8, 13, 3, 33, 1 }, 
				{ 7, 4, 5, 80, 12 }, 
				{ 17, 9, 11, 5, 4 },
				{ 4, 5, 91, 27, 7 } 
				};

		int sum = 0; // 합 저장 변수
		int cnt = 0; // 개수 저장 변수
		for (int row = 0; row < grid.length; row++) { // grid.length 2차원 배열의 길이.
			for (int c = 0; c < grid[row].length; c++) { // grid[row].length 1차원 배열의 길이.
				
				if (grid[row][c] % 3 != 0) continue;// 3의 배수면 뭔가를 하겠다. <=> 3의 배수가 아니면 건너뛰겠다.
					sum += grid[row][c];
					cnt++;
				// continue; 는 해당 반복문 안에서 continue 밑에 내용을 수행하지 않고
				// 바로 다음 반복으로 넘어간다.
			}
		}
		System.out.println(sum);
		System.out.println(cnt);
	}
}
