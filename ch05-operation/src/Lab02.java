
public class Lab02 {

	public static void main(String[] args) {

		// 다이아몬드 출력
		System.out.println("다이아몬드");
		
		for(int i = 1; i <= 5; i++ ) {
			
			// 공백을 출력
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			// *를 출력
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			
			// 줄바꿈
			System.out.println("");
		}
		
		for(int i = 5; i >= 1; i-- ) {
			
			// 공백을 출력
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			// *를 출력
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
				
			// 줄바꿈
			System.out.println("");
		}
		
		
		// 모래시계를 출력
		System.out.println("\n모래시계");
		
		for(int i = 5; i >= 1; i-- ) {
			
			// 공백을 출력
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			// *를 출력
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
				
			// 줄바꿈
			System.out.println("");
		}
		
		for(int i = 1; i <= 5; i++ ) {
			
			// 공백을 출력
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			// *를 출력
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			
			// 줄바꿈
			System.out.println("");
		}
	}

}
