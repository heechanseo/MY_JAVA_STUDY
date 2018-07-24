package icehes.science.chapter04;

public class NumberTest {

	public static void main(String[] args) {
		int number = 10;
		
		System.out.println("10은 양수 입니까? : " + (number >= 0));
		System.out.println("10은 짝수 입니까? : " + (number % 2 == 0));
		System.out.println("10은 홀수 입니까? : " + (number % 2 != 0));
		System.out.println("10은 30보다 큽니까? : " + (number > 30));
		

	}

}
