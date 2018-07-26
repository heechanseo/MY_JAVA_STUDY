package icehs.science.chapter07;



public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		Book book2 = new Book("해리포터", 15000);
		
		Book book3 = new Book("칼의 노래", "김훈");
		
		Book book4 = new Book("바람의 딸", "한비야", 39200);
		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
		book4.printBookInfo();

	}

}
