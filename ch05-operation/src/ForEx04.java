import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {

		// java.util.Scanner input = new java.util.Scanner(System.in);
		//
		// System.out.print("���ϴ� ������ �Է� > ");
		// int j = input.nextInt();

		for (int j = 2; j <= 9; j++) {
			System.out.printf("\n%***d�� ***\n", j);

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %2d\n", j, i, j * i);
			}
		}

	}

}
