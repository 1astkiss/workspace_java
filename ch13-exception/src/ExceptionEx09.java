
public class ExceptionEx09 {

	public static void main(String[] args) {

		System.out.println("no exception occurred");
		System.out.println("���α׷� ����");
		
		try {
		System.out.println("1");
		}catch(Exception e) {
			System.out.println("����ó��");
		}finally {
			System.out.println("�߿� �޽���");
		}
		System.out.println("���α׷� ����");
		
		System.out.println("==========");
		System.out.println("exception occurred");
		System.out.println("���α׷� ����");
		
		try {
			System.out.println("1");
			System.out.println(50/0);
			System.out.println("2");
			
		}catch(Exception e) {
			System.out.println("����ó��");
		}finally {
			System.out.println("�߿� �޽���");
		}
		
		System.out.println("���α׷� ����");
		
	}

}
