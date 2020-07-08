import java.util.Scanner;

public class 지능형기차 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num = 0;
		int max = 0;
		
		for(int i = 0; i < 4; i++) {
			int out = in.nextInt();
			int add = in.nextInt();
			
			num = num + add - out;
			if(max<=num) {
				max = num;
			}
		}
		System.out.println(max);
	}

}
