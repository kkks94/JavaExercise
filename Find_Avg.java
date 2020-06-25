import java.util.Scanner;

public class Find_Avg {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n;
		n = in.nextInt();
		
		int[] List = new int[n];
		System.out.println("평균을 구할 값을 " + n + "번 만큼 입력하세요.");
		for(int i = 0; i < n; i++) {
			int q = in.nextInt();
			List[i] = q;
			
		}
		double Avg;
		double Sum=0;
		
		for(int i = 0; i < n; i++) {
			Sum = Sum + List[i];
		}
		
		Avg = Sum/n;
		System.out.println(n+" 번 더한 값의 합 : "+Sum);
		System.out.println("평균 값 : "+ Avg);
		
	}
	

}
