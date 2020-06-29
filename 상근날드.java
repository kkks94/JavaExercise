import java.util.Scanner;

public class 상근날드 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다.
		// 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면,
		// 가격의 합계에서 50원을 뺀 가격이 세트메뉴의 가격이다.
		// 햄버거는 총 3종류로 상덕버거, 중덕버거, 하덕버거가 있고 음료는 콜라와 사이다가 있다.
		// 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
		
		// 입력은 총 다섯줄로 첫째줄에는 상덕버거, 둘째 줄에는 중덕, 셋째 줄에는 하덕버거의 가격이다.
		// 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다.
		// 모든 가격은 100원 이상, 2000원 이하이다.
		// 출력은 첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.
		
		// 각 버거와 음료의 가격을 입력받게 하자. 가격은 100원 이상 2000원 이하이다.
		int[] buger = new int[3];
		for(int i = 0; i < 3; i++) {
			int bugercost = in.nextInt();
			while(bugercost < 100 || bugercost > 2000) {
				System.out.println("100이상 2000이하의 값을 입력해주세요.");
				bugercost = in.nextInt();
			}
			buger[i] = bugercost;
		}
		
		int minbuger = 0;
		if(buger[0] <= buger[1] && buger[0] <= buger[2]) {
			minbuger += buger[0];
		}
		else if(buger[1]<=buger[0] && buger[1]<=buger[2]) {
			minbuger += buger[1];
		}
		else {
			minbuger += buger[2];
		}
		
		
		int[] juice = new int[2];
		for(int i = 0; i < 2; i++) {
			int juicecost = in.nextInt();
			while(juicecost < 100 || juicecost > 2000) {
				System.out.println("100이상 2000이하의 값을 입력해주세요.");
				juicecost = in.nextInt();
			}
			juice[i] = juicecost;
		}
		
		int minjuice = 0;
		if(juice[0]<=juice[1]) {
			minjuice += juice[0];
		}
		else {
			minjuice +=juice[1];
		}
		// 세트가격중 제일 싼 가격을 출력한다
		int minsetcost = minbuger + minjuice - 50;
		System.out.println(minsetcost);
		
	}

}
