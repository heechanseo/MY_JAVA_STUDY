package icehs.science.chapter10;

public class AccountTest {

	public static void main(String[] args) {
		Account [] funAcc = {
				new Account("1313-445566", "전우치", 100000),
				new FundAccount("111-222","홍길동", 5000000, 4.7),
				new FundAccount("666-777", "홍길순",1000000, 2.9 )
		};
		
		for(int i = 0; i < funAcc.length; i++) {
			if(funAcc[i] instanceof FundAccount) {
			funAcc[i].openAccount();
			((FundAccount)funAcc[i]).earnMoney();
			}else {
				funAcc[i].openAccount();
			}
			System.out.println();
		}
		
																			/*funAcc.setName("홍길동");
																			funAcc.setNumber("111-2222");
																			funAcc.setBalance(5000000);*/
																		
																			//undAcc.openAccount();
																			//fundAcc.setEarningRate(4.7);
																			//fundAcc.earnMoney();

		
	}

}
