/**
 * 
 */

/**
 * @author lastkiss
 *
 */
public class OperationEx01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 0;
		int startNum = 0;
		int endNum = 0;
		int multipleNum = 0;

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("���� ����? > ");
		startNum = input.nextInt();
		System.out.print("�� ����? > ");
		endNum = input.nextInt();
		System.out.print("�� ���? > ");
		multipleNum = input.nextInt();

		for (int i = startNum; i <= endNum; i++) {
			if (i % multipleNum == 0) {
				sum += i;
			}
		}

		System.out.printf("%d���� %d���� ������ %d�� ����� �հ�� %d�Դϴ�.\n", startNum, endNum, multipleNum, sum);
		input.close();
	}
}
