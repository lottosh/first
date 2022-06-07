import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 입력 세팅
		
		System.out.print("첫번째 숫자를 입력하세요"); // 화면에 출력
		int x = scan.nextInt(); // 실제 입력받기
		System.out.print("두번째 숫자를 입력하세요"); // 화면 출력
		int y = scan.nextInt(); // 실제 입력받기
		
		int z = x/y; // 앞숫자를 뒷숫자로 나눈 값
		int a = x%y; // 앞숫자를 뒷수자로 나누고난 나머지
		
		System.out.print(x + "를" + y + " 로 나눈 값은 " + z + "이고 나머지는 " + a + "입니다");
	}
}