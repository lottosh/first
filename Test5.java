/*
5 저금통에 있는 돈의 금액을 계산하는 프로그램을 작성하시오.
500원 : 5
100원 : 3
50원 : 2
10원 0
총 2900원 입니다.
*/

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("500원 개수 : ");
		int input1 = scan.nextInt();
		
		System.out.print("100원 개수 : ");
		int input2 = scan.nextInt();
		
		System.out.print("50원 개수 : ");
		int input3 = scan.nextInt();
		
		System.out.print("10원 개수 : ");
		int input4 = scan.nextInt();
		
	
		System.out.println("총 " + (input1*500 + input2*100 + input3*50 + input4*10) + "원 입니다.");
	}
}