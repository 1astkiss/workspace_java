
public class ExceptionEx08 {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);
			System.out.printf("���� : %d\n", num);
		}catch(Exception e) {
			System.out.println("�Ű����� ����");
		}finally {
			System.out.println("���α׷� ����");
			System.out.println("�ý��� �ڿ� ����");
		}
	}

}
