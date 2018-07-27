package icehs.science.chapter10;

public class Mobile {

	private String prodution;
	private int price;
	
	
	public String getProdution() {
		return prodution;
	}
	public void setProdution(String prodution) {
		this.prodution = prodution;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call(int time) {
		System.out.println(this.prodution + " : " + time + "분 통화했습니다.");
	}
	public void charge(int time) {
		System.out.println(this.prodution + " : " + time + "분 충전했습니다.");

	}
	

}
