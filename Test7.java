/*
7 입력받은 숫자가 홀수 인지 짝수 인지 출력하는 프로그램을 작성하시오
   삼항연산자 이용
*/

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		System.out.println( (num%2==0) ? "짝수" : "홀수");
	}
}