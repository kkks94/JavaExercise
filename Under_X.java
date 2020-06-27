import java.util.Scanner;

public class Under_X {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		// 이때 A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		
		// 첫째 줄에 N과 X가 주어진다.(1<=N, X<= 10000)
		// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두
		// 1보다 크거나 같고, 10000 보다 작거나 같은 정수이다.
		
		// X보다 작은수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나
		// 존재한다.
		
		// 1보다 같거나 큰 정수 N을 입력
		int N = in.nextInt();
		while(N < 1) {
			System.out.println("1보다 같거나 큰 정수 입력해 주세요.");
			N = in.nextInt();
		}
		// 10000보다 같거나 작은 정수 X를 입력
		int X = in.nextInt();
		while(X>10000) {
			System.out.println("10000보다 같거나 작은 정수를 입력해 주세요.");
			X = in.nextInt();
		}
		// N개로 이루어진 수열 A를 만든다.
		int A[] = new int[N];
		// 수열 A안에 N번만큼 값을 넣는다. 이때 값들은 1보다 크거나 같고 10000보다 같거나 작은 정수다.
		for(int i = 0; i < N; i++) {
			int q = in.nextInt();
			while(q<1 || q>10000) {
				System.out.println("1보다 같거나 크고 10000보다 같거나 작은 정수를 입력해 주세요.");
				q = in.nextInt();
			}
			A[i] = q;
		}
		
		// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.X보다 작은 수는 적어도 하나 존재한다.
		for(int i = 0; i < N; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
		

	}

}
