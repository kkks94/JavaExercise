import java.util.Scanner;

public abstract class 별찍기 {

	public static void main(String[] args) {

		int a;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		
		String text = new String();
		text = "* ";
		
		for(int b = 0; b < a; b++) {
			
			if(b<a) {
				System.out.println("* " +text.repeat(b));
				
				
			}
		}
		
		String answer="";
		for(int i = 1; i <= a; i++) {
			answer = answer + "* ";
			System.out.println(answer);
		}
	}
}
