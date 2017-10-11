
public class ExceptionEx06 {

	public void methodA(String[] n) throws Exception {
		
		if(n.length > 0) {
			for(int i=0; i< n.length; i++) {
				System.out.printf("n[%d] = %s\n", i, n[i]);
			}
		}else {
			throw new Exception("입력이 비어있습니다.");
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
