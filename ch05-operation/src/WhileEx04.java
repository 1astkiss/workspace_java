
public class WhileEx04 {

	public static void main(String[] args) {


		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		int j = 0;
		
		System.out.print("���� ���� �Է�(�ߴ��ϰ� ������ 1 �Է�) >");
		
		while(i>0) {
			if(i==1) {
			i = input.nextInt();
			j = i;
			}
			sum += i--;
			System.out.printf("�����հ�: %d\n", sum);
		}
		
		System.out.println("�����");
		
	}
}
