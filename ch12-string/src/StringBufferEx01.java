
public class StringBufferEx01 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Code");
		StringBuffer sb2 = sb1.append(" Dragon");
		StringBuffer sb3 = new StringBuffer("Code Dragon");
		String str = null;
		
		System.out.println(sb1 == sb3);
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		System.out.println(sb1.toString() == sb2.toString());
	}

}
