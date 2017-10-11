
public class LoopEx01 {

	public static void main(String[] args) {


		int num = 1;
		
		while(true) {
			
			if(num % 17 == 0 && num % 13 == 0) 
				break;
			
			num++;
		}
		
		System.out.printf("17의 배수이면서 13의 배수인 정수는 %d입니다.%n", num);
	}

}
