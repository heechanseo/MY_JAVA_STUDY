package icehs.science.chapter10;

public class IPhone extends Mobile {
		private String color;

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
			System.out.println(this.getProdution() + " : " + color );
		}

		@Override
		public void charge(int time) {
			System.out.println(this.getProdution() + " : " + time + "충전 했더니 Full!!!");
		}
}
