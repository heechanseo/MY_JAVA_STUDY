package icehes.science.chapter04;

public class OperatorExTest {
	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 3;
		boolean flag = false;
		
		System.out.println(num1++ + num2++);
		System.out.println(num1++ - num2++);
		System.out.println(--num1 + --num1 + --num1);
		System.out.println(--num2 + --num2 - ++num2);
		System.out.println(num2-- - --num2);
		System.out.println(++num1+1 );
		System.out.println(flag);
	}

}