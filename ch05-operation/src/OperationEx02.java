
public class OperationEx02 {

	public static void main(String[] args) {

		int sumOdd = 0;
		int sumEven = 0;
		int i = 0;
		
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
		}
		
		System.out.printf("1~100�� Ȧ���� ���� %d�̰� ¦���� ���� %d�Դϴ�.", 
				sumOdd, sumEven);
	}

}
