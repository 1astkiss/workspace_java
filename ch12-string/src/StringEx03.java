public class StringEx03 {

	public static void main(String[] args) {

		String str1 = "String Class";
		String str2 = "String Class";
		
		String str3 = new String("String Class");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
	}

}
