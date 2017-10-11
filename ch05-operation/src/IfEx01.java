
public class IfEx01 {

	public static void main(String[] args) {
/**		 Auto-generated method stub
 * 
 * @author Insoo Kim
 * 
 * 
 * 
*/
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a;
		
		System.out.print("정수 입력 > ");
		a = input.nextInt();
		
		if(a%2 == 1) {
			System.out.println("홀수임");
		}else {
			System.out.println("짝수임");
		}
		input.close();
//		printST();
	}
	
	@Test
	public static void printST() {
		System.out.println("Test");
	}
	

}
