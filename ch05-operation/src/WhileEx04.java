
public class WhileEx04 {

	public static void main(String[] args) {


		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		int j = 0;
		
		System.out.print("더할 숫자 입력(중단하고 싶으면 1 입력) >");
		
		while(i>0) {
			if(i==1) {
			i = input.nextInt();
			j = i;
			}
			sum += i--;
			System.out.printf("누적합계: %d\n", sum);
		}
		
		System.out.println("종료됨");
		
	}
}
