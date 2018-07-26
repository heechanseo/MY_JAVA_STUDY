package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount funAcc = new FundAccount();
		funAcc.setName("홍길동");
		funAcc.setNumber("111-2222");
		funAcc.setBalance(5000000);
		funAcc.openAccount();
		funAcc.setEarningRate(4.7);
		funAcc.earnMoney();

	}

}
