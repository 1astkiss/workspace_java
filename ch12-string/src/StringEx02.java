
public class StringEx02 {

	public static void main(String[] args) {

		String str1 = "My String";
		String str2 = "Your String";
		String str3 = "My String";
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ������ �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
		
		System.out.println(str1.equals(str3));
		
	}

}
