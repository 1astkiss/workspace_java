
public class ExceptionEx02 {

	public static void main(String[] args) {

		int[] var = {10,20,30};
		
		for(int i = 0; i <= var.length; i++) {
			try {
			System.out.println("var[" + i + "]: " + var[i]);
			System.out.println(i);
			}catch(Exception e) {
//				e.printStackTrace();
				System.out.println(e.toString());
			}finally {
				System.out.println("����ó�� ��");
				
				
			}
		}
		
		System.out.println("���α׷� ��");
	}

}
