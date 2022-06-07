import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요");
		int weight = scan.nextInt();
		
		System.out.print("키를 입력하세요");
		int height = scan.nextInt();
		
		// (1.1 * 몸무게) - (128*(몸무게/키));
		double result = (1.1 * weight) - (128*(weight/height));
		
		System.out.println("남자 체지방율은 " + result);
	}
}