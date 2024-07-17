package java_practice;

public class java_숫자출력_가위바위보게임_2006_DigitTest1 {
	public static void main(String[] args) {
		int num =0;
		
		for (int i = 5; i > 0; i--) {
			for (int k=0; k <5-i ; k++) 
				System.out.print("   ");
			for (int j = num+1; j < 16; j++) {
				if (j<10) {
					System.out.printf("%d  ",j);					
				}else {
					System.out.printf("%d ",j);					
				}
				if (j-num==i) {
					num+=i;
					System.out.println();

					break;
				}

			}
		}
	}
}
