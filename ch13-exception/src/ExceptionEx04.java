
public class ExceptionEx04 {

	public static void main(String[] args) {

		int var = 10;
		
		try {
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է� ����Ÿ ����");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� ���� �� ����");
		}catch(Exception e) {
			System.out.println("������ ���� �߻�");
		}
		
		for(int i=0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("���α׷�����");
		
	}

}
