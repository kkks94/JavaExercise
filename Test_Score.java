import java.util.Scanner;

public class Test_Score {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int score;
		score = in.nextInt();
		
		if(score >= 90) {
			System.out.println("축하합니다. A 등급 입니다.");
		}else if(90 < score && score >= 80) {
			System.out.println("B 등급 입니다. 참 잘했어요.");
		}else if(80 < score && score >= 70) {
			System.out.println("C 등급 입니다.");
		}else if(70 < score && score >= 60) {
			System.out.println("D 등급 입니다. 분발하세요.");
		}else{
			System.out.println("F 등급 입니다. 힘내세요.");
		}
		
		
	}

}
