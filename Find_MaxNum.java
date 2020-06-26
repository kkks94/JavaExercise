import java.util.Scanner;

public class Find_MaxNum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//서로 다른 자연수 9개의 자연수를 입력받으면 이들 중 최대값을 구하고 그 수가 몇 번째 수인지 구하기
		// 자연수 n개가 들어가는 List array를 만들고 List[]의 인덱스위치 0~n-1까지의 목록을
		// 만들고 값이 0인 int 변수 a를 만들어서 List[0~n-a] 까지의 값과 비교하면서 제일
		// 큰 값을 저장해서 나오게 하고 인덱스 번호+1과 함께 출력하기
		
		// 몇개의 자연수를 받을지 변수 n으로 정하기
		int n = in.nextInt();
		
		// int array List에 n개의 자연수를 넣기 List의 length는 n
		int[] List = new int[n]; 
		
		// List[i]에 n번 자연수 값을 넣기
		for(int i = 0; i < n; i++) {
			int p = in.nextInt();
			List[i] = p;
		}
		
		
		
		// int 변수 a를 0으로 지정해서 List[i]값과 비교해서 제일 큰 값이 남게 하기
		int a = 0;
		int q = 0;
		for(int i = 0; i <n; i++) {
//			a = a + List[i];
			if(a<List[i]) {
				a = List[i];
				q = i + 1; //인덱스 번호는 0부터 시작해서 i+1을 해야 순서가 1부터 된다.
			}
		}
		System.out.println("제일 큰 값은 "+ a + "이고 이 값은 "+ q +"번째 수이다.");
		
		
		

	}

}
