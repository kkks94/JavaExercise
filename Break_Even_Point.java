import java.util.Scanner;

public class Break_Even_Point {

	public static void main(String[] args) {

		// 월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료
		// 재산세, 보험료, 급여 등 A만원의 고정비용이 들며, 한 대의 노트북을 생산하는 데에는 
		// 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
		// 예를 들어 A=1000 B=70 이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1070만원
		// 이 들며 열 대 생산하는 데는 총 1700만원이 든다.
		// 노트북이 C가격으로 책정되었다고 한다. 생산대수를 늘려가다보면 어느 순간 총 수입(판매비용)
		// 이 총 비용(=고정비용+가변비용) 보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져
		// 이익이 발생하는 지점을 손익분기점(Break Even Point)이라고 한다.
		// A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
		
		// 첫째 줄에 A, B ,C가 빈 칸을 사이에 두고 순서대로 주어진다. A B C는 각 21억 이하의 자연수이다.
		Scanner in = new Scanner(System.in);
		int A, B, C;
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		
		if(B>=C) {
			System.out.println(-1);
		}
		else {
			System.out.println(A/(C-B)+1);
		}
		
	}

}
