
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
		
		System.out.print("���� �Է� > ");
		a = input.nextInt();
		
		if(a%2 == 1) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("¦����");
		}
		input.close();
//		printST();
	}
	
	@Test
	public static void printST() {
		System.out.println("Test");
	}
	

}
