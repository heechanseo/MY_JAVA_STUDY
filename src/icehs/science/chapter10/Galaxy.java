package icehs.science.chapter10;

public class Galaxy extends Mobile {
	private String osVersion;

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
		System.out.println(this.getProdution() + " : 안드로이드 오레오"  );
	}
	
	@Override
	public void charge(int time) {
		System.out.println(this.getProdution() + " : 보조 배터리 " + time + "분 충전");
	}
}
