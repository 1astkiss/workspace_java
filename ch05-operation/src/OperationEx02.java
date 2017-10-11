
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
		
		System.out.printf("1~100중 홀수의 합은 %d이고 짝수의 합은 %d입니다.", 
				sumOdd, sumEven);
	}

}
