
public class ForEx02 {
	public static void main(String[] args) {

		System.out.println("�� ���ڰ� 1�� ���� ��Ű��");

		for (int i = 5; i >= 1; i--) {
			System.out.print(i + "\t");
		}
		System.out.println("\n���α׷� ����");

		System.out.println();
		System.out.println("�� ���ڰ� 2�� ���� ��Ű��");
		for (int i = 0; i <= 10; i+=2) {

			if (i % 2 == 0)
				System.out.print(i + "\t");

		}
		System.out.println("\n���α׷� ����");
	}
}