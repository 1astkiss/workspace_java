
public class StringEx04 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		
		// ��ü ��
		if(str1==str2) {
			System.out.println("str1�� str2�� ���� ��ü");
		}else {
			System.out.println("str1�� str2�� �ٸ� ��ü");
		}
		
		// ��ü�� ����(���ڿ�)��
		if(str1.equals(str2))
			System.out.println("str1�� str2�� ������ �����ϴ�.");
		else
			System.out.println("str1�� str2�� ������ �ٸ��ϴ�.");
		
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
		
		// ��ü ��
		if(msg1==msg2) {
			System.out.println("msg1�� msg2�� ���� ��ü");
		}else {
			System.out.println("msg1�� msg2�� �ٸ� ��ü");
		}
		
		// ��ü�� ����(���ڿ�)��
		if(msg1.equals(msg2))
			System.out.println("msg1�� msg2�� ������ �����ϴ�.");
		else
			System.out.println("msg1�� msg2�� ������ �ٸ��ϴ�.");
		
	}

}
