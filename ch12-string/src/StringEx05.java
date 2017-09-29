
public class StringEx05 {

	public static void main(String[] args) {

		String str1 = "Java" + "love";
		String str2 = "Java".concat("love");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1==str2);
		
		String str3 = "Java" + 'A';
		String str4 = "Java".concat(String.valueOf('A'));
		String str5 = "Java".concat("A");
		String str6 = "JavaA";
		System.out.println(str3==str4);
		System.out.println(str3==str5);
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		System.out.println(str3==str6);
		System.out.println(str3.equals(str6));
		
		
	}

}
