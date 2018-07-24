package icehes.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
	int number = 456;
	int hundnumber = number / 100;
	int tennumber = number %100 / 10 ;
	int onenumber = number %10 / 1 ;
	
	System.out.println("숫자 : " + number);
	System.out.println("백의 자리 수 : " + hundnumber);
	System.out.println("십의 자리 수 : " + tennumber);
	System.out.println("일의 자리 수 : " + onenumber);

	}

}
