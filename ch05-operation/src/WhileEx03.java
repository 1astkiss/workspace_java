
public class WhileEx03 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			System.out.printf("%d������ ���� %d�Դϴ�.\n", i, sum);

			i++;
		}
		
		System.out.printf("���� %d�Դϴ�.", sum);

	}

}
