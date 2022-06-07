import java.util.Scanner;

// 클래스명 = 파일명 같게
public class Ex1 {
	// 실행할 메서드 - 시작점 - main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 키보드로 입력받기위한 세팅
		// 세팅완료
		System.out.print("이름을 입력하세요 :");
		// 입력을 받는 위치
		String name = scan.next(); // 키보드로 문자열(긴문자)받기
		
		System.out.print("나이를 입력하세요 :");
		int age = scan.nextInt(); // 키보드로 정수 받기
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다");
	}
}