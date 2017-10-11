
public class BreakEx01 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 (종료하고 싶으면 0 입력) > ");

			i = input.nextInt();
			if(i==0) {
				System.out.printf("종료합니다.%n", i);
				break;
			}

			sum += i;
			System.out.printf("합은 %d입니다.%n", sum);
			
		}
		
//		do {
//			System.out.println(j);
//			j++;
//			if(j==7) break;
//		}
//		while(j<=10);
	}

}
