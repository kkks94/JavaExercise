import java.util.Scanner;

public class Remainder_Others {

	public static void main(String[] args) {

		/* 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구하
		 * 그 다음 나머지가 서로 다른 값이 몇 개 있는지 출력하기
		 * 입력 받을 값은 음이아닌 정수이고 1000보다 작거나 같다.
		 * 
		 * List[]에 10개의 값이 들어가게 하고 그 수들을 42로 나눈 나머지 값들을
		 * remainder[]에 저장 시킨 후 그중에서 서로 다른 값의 갯수를 구해보자
		 */
		
		Scanner in = new Scanner(System.in);

		int List[] = new int[10]; //List[]에 10개 값이 들어간다. length가 10
		System.out.println("1000 보다 작고 음이 아닌 정수를 10번 입력해주세요.");
		// List에 음이아닌 정수와 1000보다 같거나 작은 수가 입력되면 List[]에 저장하기
		for(int i = 0; i < 10; i++) {
			int n = in.nextInt();
			if(n >= 0 && n<=1000) {
				List[i] = n;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				i = i - 1;
			}
		}
		
		// List에 저장된 값들을 42로 나눈 나머지 값을 remainder[]에 저장하기
		System.out.print("42로 나눈 나머지 값 : ");
		int remainder[] = new int[10];
		for(int i = 0; i < 10; i++) {
			remainder[i] = List[i] % 42;
			System.out.print(remainder[i]+" ");
		}
		
		// remainder[]에 저장된 나머지 값들중 서로 다른 값의 갯수를 구하기
		boolean[] check = new boolean[42];
		for(int i = 0; i < 10; i++) {
			if(check[remainder[i]]==false) {
				check[remainder[i]] = true;
			}
		}
		int num = 0;
		for(int i = 0; i < 42; i++) {
			if(check[i]==true) {
				num = num + 1;
			}
		}
		System.out.println("\n 서로 다른 나머지 갯수 : "+ num);
		
		
		
		
//		int others = 20;           실
//		for(int i = 0; i < 10; i++) {
//			for(int p = 9; p >= 0; p--) {
//				if(remainder[i]==remainder[p]) {
//					others = others - 1;
//				}
//			}
//		}
//		System.out.println("\n서로 다른 나머지 갯수 : "+ others);
		
	}

}
