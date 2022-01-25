package workbook;

public class Extend73 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		StringBuilder sb = new StringBuilder("Hello World");
		
		System.out.println(s);
		System.out.println(sb);
		
		System.out.println(s.length());
		System.out.println(sb.length());
		
		// System.out.println(s == sb); // このままでは比較ができない
		System.out.println(s == sb.toString());
		System.out.println(s.equals(sb.toString()));
		
		
	}

}
