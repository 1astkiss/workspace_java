
public class BreakEx01 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� (�����ϰ� ������ 0 �Է�) > ");

			i = input.nextInt();
			if(i==0) {
				System.out.printf("�����մϴ�.%n", i);
				break;
			}

			sum += i;
			System.out.printf("���� %d�Դϴ�.%n", sum);
			
		}
		
//		do {
//			System.out.println(j);
//			j++;
//			if(j==7) break;
//		}
//		while(j<=10);
	}

}
