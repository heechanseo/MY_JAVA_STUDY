package icehs.science.chapter07;

public class Television {
	String name;
	int price;
	String description;
	
		public Television(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Television(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		
		
	}
	void printTelevisionInfo() {
		System.out.println(this.name +  this.description +  " : " + this.price );
		
		
	}
	

}
