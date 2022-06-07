import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 직육면체의 겉넓이 = (밑넓이) * 2 + (옆넓이)
		System.out.print("밑넓이를 입력하시오 : ");
		int a = scan.nextInt();
		System.out.print("옆넓이를 입력하시오 : ");
		int b = scan.nextInt();
		System.out.println("직육면체의 겉넓이 : " + (a * 2) + b);
		
		// 정육면체의 겉넓이 = (한 면의 넓이) * 6
		System.out.print("한 면의 넓이를 입력하시오 : ");
		int c = scan.nextInt();
		System.out.println("정육면체의 겉넓이 : " + c * 6);
		
		// 직육면체의 부피 = 가로 * 세로 * 높이
		System.out.print("가로 : ");
		int d = scan.nextInt();
		System.out.print("세로 : ");
		int e = scan.nextInt();
		System.out.print("높이 : ");
		int f = scan.nextInt();	
		System.out.println("직육면체의 부피 : " + (d * e * f));
		
		// 원주(원의 둘레의 길이) = 반지름 * 2 * 3.14
		System.out.print("반지름을 입력하시오 : ");
		Double r = scan.nextDouble();
		System.out.println("원주 : " + (r * 2 * 3.14));
		
		// 원의 넓이 = 반지름 * 반지름 * 3.14
		System.out.print("반지름을 입력하시오 : ");
		r = scan.nextDouble();
		System.out.println("원의 넓이 : " + (r * r * 3.14));
		
		// 소금물의 농도 = 소금의 양/소금물의 양 * 100
		System.out.print("소금의 양을 입력하시오 : ");
		int s = scan.nextInt();
		System.out.print("소금물의 양을 입력하시오 : ");
		int sw = scan.nextInt();
		
		System.out.println("소금물의 농도 : " + (double)s / sw * 100);
		
		// 부채꼴 호의 길이 = 2 PI r * a/360 (알파는 중심각)
		final double PI = 3.14;
		System.out.print("반지름을 입력 : ");
		r = scan.nextDouble();
		System.out.print("중심각을 입력 : ");
		double a1 = scan.nextDouble();
		System.out.println("부채꼴 호의 길이 : " + (2*PI*r) * (a1/360));
		
		// 부채꼴 넓이 = PI r r * a/360
		System.out.print("반지름을 입력 : ");
		r = scan.nextDouble();
		System.out.print("중심각을 입력 : ");
		double a2 = scan.nextDouble();
		System.out.println("부채꼴 넓이 : " + (PI*r*r) * (a2/360));
		
		// 속력 = 거리 / 시간
		System.out.print("거리를 입력하시오 : ");
		int x = scan.nextInt();
		System.out.print("시간을 입력하시오 : ");
		int t = scan.nextInt();
		System.out.println("속력 : " + x / t);
		
		// 속도 = (출발한 곳에서 도착한 거리) / 걸린 시간
		
		
	}
}