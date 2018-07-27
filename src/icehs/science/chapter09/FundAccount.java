package icehs.science.chapter09;

public class FundAccount extends Account {
	
	private double earningRate;
	
	public FundAccount(String number, String name, int balance, double earningRate) {
		
		super(number, name, balance);
		this.earningRate = earningRate;
		}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	@Override
	public void openAccount() {
		System.out.println("계좌를 개설 합니다.");
		System.out.println("펀드계좌번호 : " + getNumber());
		System.out.println("예금주 : " + this.getName());
		System.out.println("잔액 : "  + this.getBalance() + "원");
	}
	
	
	public void earnMoney() {
		System.out.println("수익률 : " + this.earningRate + "%");
		System.out.println("수익이 발생 했습니다.");
	}
}

