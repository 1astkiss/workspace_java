
public class BreakEx03 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3)
					break;
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
		
		System.out.println("==========");
		
		iLoop:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3)
					break iLoop;
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
	}

}
