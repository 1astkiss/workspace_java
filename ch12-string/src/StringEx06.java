
public class StringEx06 {

	public static void main(String[] args) {
		
		String name = "Hong Kil Dong";
//		Hong Kil D o  n  g
//		0123456789 10 11 12
		
		int index = name.indexOf('n');
		System.out.println("�� ó�� ����  n��ġ: " + index);
		
		index = name.indexOf("Kil");
		System.out.println("���ڿ� Kil�� ��ġ: " + index);
		
		index = name.lastIndexOf('n');
		System.out.println("������ ���� n�� ��ġ: " + index);
		
		index = name.indexOf('K');
		System.out.println("");
		
		String str = name.substring(index);
		System.out.println(str);
		
		index = 5;
		str = name.substring(index,  index + 3);
		System.out.println(str);
		
		int length = name.length();
		
		String[] arr = name.split(" ");
		for(String a:arr) System.out.println(a);
	}

}
