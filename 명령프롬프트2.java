import java.util.Scanner;

public class 명령프롬프트2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		char[] ctia = in.next().toCharArray();
		for(int i=1; i<n; i++) {
			String name = in.next();
			
			for(int j=0; j<ctia.length; j++) {
				char data = ctia[j];
				
				if(data !='?') {
					if(data != name.charAt(j)) {
						ctia[j] = '?';
					}
				}
			}
		}
		for (char ch : ctia) {
			System.out.print(ch);
		}
	}

}
