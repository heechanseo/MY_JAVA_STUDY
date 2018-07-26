package icehs.science.chapter09;

public class Person {
	private String name;
	private String phoneNo;
 
	 public void eat() {
		 System.out.println("밥을 먹어요.");
 }
}

class Student extends Person{
	private String department;
	
	public void study() {
		System.out.println("프로그래밍 공부합니다.");
	}
}

class Teacher extends Person{
	private String subject;
		
	public void teach() {
		System.out.println("집에 가고 싶어요 ㅠㅠ");
	
	}
}