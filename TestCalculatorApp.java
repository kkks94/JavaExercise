import java.util.Scanner;
import java.util.regex.Pattern;

public class TestCalculatorApp {

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double a;
		double b;
		String mark;
		
		a = in.nextDouble(); 
		mark = in.next();  
		b = in.nextDouble();
	
//		System.out.println(a + mark + b );
		
//		Pattern c;
//		c = in.delimiter();
//		System.out.println(c);
		
		while(true) {
			
			if(mark.equals("+") && Double.isFinite(a) && Double.isFinite(b)) {
//				System.out.println(Double.toString(a)+"+"+Double.toString(b)+"= "+a + b);   한번 문자열로된 변수는 계속 문자열인듯
				//  + Double.parseDouble("a") + Double.parseDouble("b") 해도 부호 + 자체가 문자열을 붙이는 개념으로 바뀌는듯
				System.out.println(a+" " + mark +" "+ b +" = "); 
				System.out.println(a + b);
				a = a + b;
				mark = in.next();
				b = in.nextDouble();
			}
			else if(mark.equals("-") && Double.isFinite(a) && Double.isFinite(b)) {
				System.out.println(a+" " + mark +" "+ b +" = " ); 
				System.out.println(a - b);
				a = a - b;
				mark = in.next();
				b = in.nextDouble();
			}
			else if(mark.equals("*") && Double.isFinite(a) && Double.isFinite(b)) {
				System.out.println(a+" " + mark +" "+ b +" = " ); 
				System.out.println(a * b);
				a = a * b;
				mark = in.next();
				b = in.nextDouble();
			}
			else if(mark.equals("/") && Double.isFinite(a) && Double.isFinite(b)) {
				System.out.println(a+" " + mark +" "+ b +" = " ); 
				System.out.println(a / b);
				a = a / b;
				mark = in.next();
				b = in.nextDouble();
			}else if(mark.equals("c") || Double.toString(a).equals("c") || Double.toString(b).equals("c")) {
				System.out.println("감사합니다");
				break;
			}
			
			else {
				System.out.println("다시 입력해 주세요");
//				a = in.nextDouble();
				mark = in.next();
				b = in.nextDouble();
				
			}
			
		}
		
		// 인넥스트 더블자체가 문자열을 못받아서 이프문에 조건 건거 의미가없었음.. 인자가 더블이면 트루되는 메소드랑 a b 스트링으로 바꿔서 이꼴 c 만드는법 열심히 찾았는데...
		// 위의 이유로 엘스이프 조건문이 마크는 c만 적용되서 끝내려면 "c 숫자" 를 넣어야 감사합니다 나옴 
		
	}

}
