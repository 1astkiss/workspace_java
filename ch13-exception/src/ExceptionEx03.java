
public class ExceptionEx03 {

	public static void main(String[] args) {

		int[] var = {10, 20, 30};
		
		try {
			System.out.println(var[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		System.out.println("end of program");
	}

}
