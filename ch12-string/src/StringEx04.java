
public class StringEx04 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		
		// 객체 비교
		if(str1==str2) {
			System.out.println("str1과 str2는 같은 객체");
		}else {
			System.out.println("str1과 str2는 다른 객체");
		}
		
		// 객체의 내용(문자열)비교
		if(str1.equals(str2))
			System.out.println("str1과 str2는 내용이 같습니다.");
		else
			System.out.println("str1과 str2는 내용이 다릅니다.");
		
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str1);
		System.out.println(str2);
		
		
		String msg1 = new String("World");
		String msg2 = new String("World");
		System.out.println(msg1.hashCode());
		System.out.println(msg2.hashCode());
		
		// 객체 비교
		if(msg1==msg2) {
			System.out.println("msg1과 msg2는 같은 객체");
		}else {
			System.out.println("msg1과 msg2는 다른 객체");
		}
		
		// 객체의 내용(문자열)비교
		if(msg1.equals(msg2))
			System.out.println("msg1과 msg2는 내용이 같습니다.");
		else
			System.out.println("msg1과 msg2는 내용이 다릅니다.");
		
	}

}
