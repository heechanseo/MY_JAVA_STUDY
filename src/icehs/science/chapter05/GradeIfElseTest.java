package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int gilldongScore = 92;
		int gillsoonScore = 85;
		
		if (gilldongScore >=90  && gilldongScore <=100) {
			System.out.println("홍길동 : A학점 입니다.");
		}else {
			System.out.println("홍길동 : A학점을 받지 못했습니다.");
		}
		if (gillsoonScore >=90  && gillsoonScore <=100) {
			System.out.println("홍길순 : A학점 입니다.");
		}else { 
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}

	}

}
