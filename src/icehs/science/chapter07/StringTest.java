package icehs.science.chapter07;

public class StringTest {

	public static void main(String[] args) {
		String abc = "astro megazord";
		String cde = "astro megazord";
		String fgh = new String("astro megazord");
		String xyz = new String("astro megazord");
		
		System.out.println( abc == cde);
		System.out.println(fgh == xyz);
		
		System.out.println(abc == xyz);
		System.out.println(abc.equals(xyz));
		System.out.println(fgh.equals(xyz));

	}

}
