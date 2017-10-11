
public class ContinueEx03 {

	public static void main(String[] args) {


		for(int i = 0; i <= 10; i++) {
			if(i == 7)
				continue;
			System.out.println(i);
				
		}
		
		System.out.println("=================================");
		for(int j = 0; j <= 7; j++) {
			if(j == 7)
			break;
			System.out.println(j);
		}
	}

}
