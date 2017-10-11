
public class ExceptionEx06 {

	public void methodA(String[] n) throws Exception {
		
		if(n.length > 0) {
			for(int i=0; i< n.length; i++) {
				System.out.printf("n[%d] = %s\n", i, n[i]);
			}
		}else {
			throw new Exception("�Է��� ����ֽ��ϴ�.");
		}
	}
	
	public static void main(String[] args) {

		ExceptionEx06 ex = new ExceptionEx06();
		
		try {
			ex.methodA(args);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
