import java.util.Scanner;

public class 알파벳찾기_실패 {

	public static void main(String[] args) {
		
//		1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		Scanner in = new Scanner(System.in);
		String S;
		S = in.nextLine();
		
		
		int i;
		i = S.length();
		
//		String[] A = new String[i];
		
		String[] text = {"a", "b", "c", "d","e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}; 
		String text2 = "abcdefghijklmnopqrstuvwxyz";
		
//		System.out.println(text2.charAt(1));
		
		
		
		for(int a = 0; a <i; a++) {
			
			for(int b = 0; b <26; b++) {
				String answer = " ";
				if(S.charAt(a) == text2.charAt(b)) {
					answer = answer + a;
				}
				else {
					answer = answer + "-1";
				}
				System.out.println(answer);
			}
		}
		
		
		
	}

}
