
public class StringEx08 {

	public static void main(String[] args) {

		String file1 = "Helloword.txt";
		System.out.println(file1.endsWith(".txt"));
		
		String file2 = "Helloword.db";
		System.out.println(file2.endsWith(".txt"));
		
		String s1 = "Hello";
		System.out.println(s1.equals("hello"));
		System.out.println(s1.startsWith("Hell"));
		
		String s3 = "Hello World";
		
		String s4 = "Everythings gonna be alright.";
		String s5 = s4.toString();
		System.out.println("result: " + s5);
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		
		String s6 = String.valueOf(s4);
		System.out.println(s6);
		
		java.util.Date date = new java.util.Date();
		String strDate = String.valueOf(date);
		System.out.println(strDate);
	}

}
