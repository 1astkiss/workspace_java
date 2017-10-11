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

		System.out.print("시작 숫자? > ");
		startNum = input.nextInt();
		System.out.print("끝 숫자? > ");
		endNum = input.nextInt();
		System.out.print("몇 배수? > ");
		multipleNum = input.nextInt();

		for (int i = startNum; i <= endNum; i++) {
			if (i % multipleNum == 0) {
				sum += i;
			}
		}

		System.out.printf("%d부터 %d까지 숫자중 %d의 배수의 합계는 %d입니다.\n", startNum, endNum, multipleNum, sum);
		input.close();
	}
}
