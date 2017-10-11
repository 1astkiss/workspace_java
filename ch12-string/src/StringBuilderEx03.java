
public class StringBuilderEx03 {

	public static void main(String[] args) {

		String str1 = 3 + "Java" + 7;
		System.out.println(str1);
		
		String str2 = String.valueOf(3).concat("Java").concat(String.valueOf(7));
		System.out.println(str2);
		
		String str3 = new StringBuilder().append(3).append("Java").append(7).toString();
		System.out.println(str3);
		
	}

}
