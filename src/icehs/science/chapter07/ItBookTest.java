package icehs.science.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sq1 = new ItBook("SQL Plus", 50000, 5.5);
		ItBook java = new ItBook("Java 2.0", 28000, 2.3);
		ItBook jsp = new ItBook("JSP Servlet", 28000, 3.2);
		sq1.printItBookInfo();
		java.printItBookInfo();
		jsp.printItBookInfo();
		
		System.out.println();
		
		System.out.println(sq1.getTitle()+" 정가를 변경합니다.");
		sq1.setPrice(55000);
		sq1.setDiscountRate(9.5);
		sq1.printItBookInfo();
		
		System.out.println();
		System.out.println(java.getTitle()+" 정가를 변경합니다.");
		java.setPrice(33000);
		java.printItBookInfo();
		
		System.out.println();
		System.out.println(jsp.getTitle()+" 제목과 할인율을 변경합니다.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printItBookInfo();
			
		
	}

}
