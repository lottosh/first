/*
6 압력의 세기를 가리켜 압력이라 말하기도 한다. 
  앞의 정의와 같이 압력의 세기는 (힘)÷(면적)의 단위로 표시된다. 
  국제단위계에서는 1㎡에 1N의 힘이 일정하게 미칠 때의 압력의 세기가 단위이다. 
  이것을 파스칼이라 부르며 Pa라고 표기한다. 힘과 면적을 입력받아 Pa를 출력하시오
*/

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("힘을 입력 : ");
		int power = scan.nextInt();
		System.out.print("면적을 입력 : ");
		int m = scan.nextInt();
		
		System.out.println("압력의 세기는 : " + power/m);
	}
}