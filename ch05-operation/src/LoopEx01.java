
public class LoopEx01 {

	public static void main(String[] args) {


		int num = 1;
		
		while(true) {
			
			if(num % 17 == 0 && num % 13 == 0) 
				break;
			
			num++;
		}
		
		System.out.printf("17�� ����̸鼭 13�� ����� ������ %d�Դϴ�.%n", num);
	}

}
