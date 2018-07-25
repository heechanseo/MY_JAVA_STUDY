package icehs.science.chapter06;

public class Account {

	String accName;
	String accNo;
	int balance;
	
	public int getBalance() {
		return balance;
	}
	
	void deposit(int money) {
		balance += money;
		if(money < 0) {
			System.out.println("[ 에러 ] 금액은 음수를 입력할 수 업습니다.");
		}else {
			System.out.println(" 잔액  : " + money + "원");
		}
			
	}
	
	void withdraw(int money) {
		
		if(money < 0) {
			System.out.println(" [ 에러 ] 금액은 음수를 입력할 수 없습니다.");
		}else if(money > balance) {
			System.out.println("[ 에러 ] 잔액이 부족합니다. ");
		}else  {
			balance -= money;
		
		
			}
	}

		
	
	void printAccountInfo() {
		
		System.out.println(" 계좌 " + accNo + " ( " + " 예금주 : 홍길동  " + " ) ");
		System.out.println(" 잔액 : " + balance + " 원 ");
		
	}
	
	
}
