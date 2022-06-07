import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm)");
		int height = scan.nextInt();
		
		// 1피트는 12인치이고 1인치는 2.54cm
		double inch = height / 2.54;
		System.out.println("인치로 바꾸면" + inch);
		
		// inch를 feet로 바꾸면된다
		double feet = (inch / 12); // 피트
		double modinch = (inch % 12); // 나머지 인치
		System.out.print((int)feet + "피트 " + modinch + "인치");
	}
}