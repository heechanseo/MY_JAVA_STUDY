package icehs.science.chapter10;

public class Cars implements Washer{
	
	private int oilSize;

	public Cars(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	
	public void go(int distance) {
		System.out.println(distance + "km 이동합니다.");
	}

	@Override
	public void wash() {
		System.out.println("세차합니다.");
		
	}
}

