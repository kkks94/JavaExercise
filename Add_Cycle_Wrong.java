import java.util.Scanner;

public class Add_Cycle_Wrong {

	public static void main(String[] args) {

		// 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 한다.
		// 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리수로 만들고, 각 자리의 숫자를 더한다.
		// 그 다음, 주어진 수의 가장 오른쪽 자리수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면
		// 새로운 수를 만들 수 있다. 다음 예를 보자
		// 26 부터 시작한다. 2+6=8이다. 새로운 수는 68 이다. 6+8=14이다. 새로운 수는 84이다.
		// 8+4=12다. 새로운 수는 42다. 4+2=6이다. 새로운 수는 26이다.
		// 위의 얘는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		
		// 첫째 줄에 N이 주어지고 N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		while(N<0 || N>100) {
			System.out.println("0이상 99이하의 수를 입력해주세요.");
			N = in.nextInt();
		}
		// 조건에 맞는 걔산을 하고 사이클을 구하기
		int F = N;
		int A = 0;
		int count = 1;
		do {
			int cipher = (int)(Math.log10(F));
			
			if(cipher == 1) {
				String first = Integer.toString(F%10);
				String second = Integer.toString((F+F)%10);
				String Num = first + second;
				F = Integer.parseInt(Num);
			}
			if(cipher == 2) {
				String first = Integer.toString(F%10);
				String second = Integer.toString( ((F/10) + (F%10)) % 10 );
				String Num = first + second;
				F = Integer.parseInt(Num);
			}
			count += 1;
		} while(F == N); 
		
		System.out.println(count);
		
	}

}
