package java_practice;

public class java_숫자출력_가위바위보게임_2006_DigitTest2 {
	public static void main(String[] args) {
		int num =0;
		
		for (int i = 5; i > -3; i=i-2) {
			if (i>=0) {
				for (int k=0; k <5-i ; k++) 
					System.out.print("  ");				
			}else {
				for (int k=0; k <3+i ; k++) 
					System.out.print("  ");							
			}
			
			for (int j = num+1; j < 18; j++) {
				if (j<10) {
					System.out.printf("%d   ",j);					
				}else {
					System.out.printf("%d  ",j);					
				}
				
				if (i>=0) {
					if (j-num==i) {
						num+=i;
						System.out.println();
						
						break;
					}
		
				}else {
					if (j-num==i*(-2)+1) {
						num+=i;
						System.out.println();	
					}
				}

			}
		}
	}
}
