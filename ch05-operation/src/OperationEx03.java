
public class OperationEx03 {

	public static void main(String[] args) throws Exception {

		int MAX = 5;
		int MIN = 1;
		int SLEEP_TIME = 10;
		int CHAR_REPEAT = 10;
		String PRINT_STRING = "*";
		String PRINT_SPACE = " ";
		
		for(int i = MIN; i <= MAX; i++) {
			for(int j = MIN; j <= i; j++) {
				for(int l = 1; l <= CHAR_REPEAT; l++)
				System.out.print(PRINT_STRING);
				Thread.sleep(SLEEP_TIME);
			}
			System.out.println();
		}
	
		for(int i = MAX; i >= MIN; i--) {
			for(int j = MIN; j <= i; j++) {
				for(int l = 1; l <= CHAR_REPEAT; l++)
				System.out.print(PRINT_STRING);
				Thread.sleep(SLEEP_TIME);

			}
			System.out.println();
		}
		
		for(int i = MAX; i >= MIN; i--) {
			
			for(int j = MIN; j < i; j++) {
				for(int l = 1; l <= CHAR_REPEAT; l++)
					System.out.print(PRINT_SPACE);
			}
			
			for(int k=MAX; k >= i; k--){
				for(int l = 1; l <= CHAR_REPEAT; l++)
				System.out.print(PRINT_STRING);
				Thread.sleep(SLEEP_TIME);

			}
			
			System.out.println();
		}
		
		for(int i = MAX; i >= MIN; i--) {
			
			for(int j = MAX; j > i; j--) {
				for(int l = 1; l <= CHAR_REPEAT; l++)
				System.out.print(PRINT_SPACE);
			}
			
			for(int k=MIN;k <= i; k++){
				for(int l = 1; l <= CHAR_REPEAT; l++)
				System.out.print(PRINT_STRING);
				Thread.sleep(SLEEP_TIME);

			}
			
			System.out.println();
		}
		
	}
}
