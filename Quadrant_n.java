import java.util.Scanner;

public class Quadrant_n {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 사분면 고르기  점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내기
		// x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		
		// 첫 줄에는 정수 x가 주어진다.(-1000<=x<=1000, x != 0)
		System.out.println("x좌표 값을 입력해 주세요.");
		int x = in.nextInt();
		while(x < -1000 || x > 1000 || x == 0) {
			System.out.println("0이 아니고 -1000과 1000 사이의 정수를 입력해주세요.");
			x = in.nextInt();
		}
		// 다음 줄에는 정수 y가 주어진다 (범위는 마찬가지)
		int y = in.nextInt();
		while(y < -1000 || y > 1000 || y == 0) {
			System.out.println("0이 아니고 -1000과 1000 사이의 정수를 입력해주세요.");
			y = in.nextInt();
		}
		
		// 점 (x,y) 좌표로 사분면 번호를 출력하기
		System.out.print("("+x+","+y+")"+" 의 좌표는 ");
		
		if(x > 0 && y > 0) {
			System.out.println(1+"사분면 입니다.");
		}
		else if(x > 0 && y < 0) {
			System.out.println(4+ "사분면 입니다.");
		}
		else if(x < 0 && y > 0) {
			System.out.println(2+ "사분면 입니다.");
		}
		else {
			System.out.println(3+ "사분면 입니다.");
		}
	
	

	}

}
