
public class WhileEx03 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			System.out.printf("%d까지의 합은 %d입니다.\n", i, sum);

			i++;
		}
		
		System.out.printf("합은 %d입니다.", sum);

	}

}
