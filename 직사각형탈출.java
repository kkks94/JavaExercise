import java.util.Scanner;

public class 직사각형탈출 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x, y, w, h;
		x = in.nextInt();
		y = in.nextInt();
		w = in.nextInt();
		h = in.nextInt();
		
		int xmin = 0;
		int ymin = 0;
		
		if(w>2*x) {
			xmin = x;
		}
		else {
			xmin = w-x;
		}
		if(h>2*y) {
			ymin = y;
		}
		else {
			ymin = h-y;
		}
		
		if(xmin>ymin) {
			System.out.println(ymin);
		}
		else {
			System.out.println(xmin);
		}
	}

}
