
public class Lab02 {

	public static void main(String[] args) {

		// ���̾Ƹ�� ���
		System.out.println("���̾Ƹ��");
		
		for(int i = 1; i <= 5; i++ ) {
			
			// ������ ���
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			// *�� ���
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			
			// �ٹٲ�
			System.out.println("");
		}
		
		for(int i = 5; i >= 1; i-- ) {
			
			// ������ ���
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			// *�� ���
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
				
			// �ٹٲ�
			System.out.println("");
		}
		
		
		// �𷡽ð踦 ���
		System.out.println("\n�𷡽ð�");
		
		for(int i = 5; i >= 1; i-- ) {
			
			// ������ ���
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			// *�� ���
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
				
			// �ٹٲ�
			System.out.println("");
		}
		
		for(int i = 1; i <= 5; i++ ) {
			
			// ������ ���
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			// *�� ���
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			
			// �ٹٲ�
			System.out.println("");
		}
	}

}
