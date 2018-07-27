package icehs.science.chapter10;

public class Person {
	private String name;
	private String phoneNo;
 
	 public void eat() {
		 System.out.println("밥을 먹어요.");
 }		
	
}

class Student extends Person{
	private String department;
	
													//@Override쓸 경우 오류 (이줄에)                  
	public void study() {					//void 대신 int 쓸경우 부모와 자식이 달라 오류
		System.out.println("프로그래밍 공부합니다.");
	}
	
	//@Override
	 //public void sleep() {
	//System.out.println("잠을 잡니다.");
	//}
	@Override
	public void eat( ) {//protected 쓸경우도 부모와 다르므로 오류
		super.eat();
		System.out.println("조별로 먹어요.");
	}
}

class Teacher extends Person{
	private String subject;
		
	public void teach() {
		System.out.println("집에 가고 싶어요 ㅠㅠ");
	
	}
	
	//@Override
	// public void sleep() {
			//System.out.println("잠을 잡니다.");
	
	//}
	@Override
	public void eat(){
		super.eat();
		System.out.println("다 같이 먹어요.");
	}
}
