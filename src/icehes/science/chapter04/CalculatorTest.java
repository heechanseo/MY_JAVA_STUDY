package icehes.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int firstNum = 20; 
		int secondNum = 7;
		
		int addResult = firstNum + secondNum;
		int subtractResult = firstNum - secondNum;
 		int multiplyResult = firstNum * secondNum;
		int divideResult = firstNum / secondNum;
		int remainderResult = firstNum % secondNum;
		
		System.out.println("덧셈 결과 : " + addResult);
		System.out.println("뺄셈 결과 : " + subtractResult);
		System.out.println("곱셈 결과 : " + multiplyResult);
		System.out.println("나눗셈 결과 : " + divideResult);
		System.out.println("나머지 : " + remainderResult);

	}

}
