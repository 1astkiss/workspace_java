// TODO : this is

public class ContinueEx02 {

	public static void main(String[] args) {

		int count = 0;
		for(int i=1; i<=100; i++) {
			if(!(i%3==0 || i%7==0)) {
				continue;
			}
			
			System.out.print(i + ", ");
			count++;
			if(count%10==0) {
				System.out.println();
			}
		}
		
		System.out.printf("\n3의 배수이거나 7의 배수인수는 모두 %d개 입니다", count);

	}

}
