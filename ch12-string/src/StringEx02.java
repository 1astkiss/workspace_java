
public class StringEx02 {

	public static void main(String[] args) {

		String str1 = "My String";
		String str2 = "Your String";
		String str3 = "My String";
		
		if(str1 == str2)
			System.out.println("str1과 str2는 동일한 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		System.out.println(str1.equals(str3));
		
	}

}
