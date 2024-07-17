package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class java_1차원배열순회_2025 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,0,9,8,7,6,5,4,3,2,1};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] strarray = new String[num]; 
		
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			strarray[i] = str;
		}
		for (int i = 0; i < strarray.length; i++) {
			System.out.println(strarray[i]);
			
		}
	}
}
