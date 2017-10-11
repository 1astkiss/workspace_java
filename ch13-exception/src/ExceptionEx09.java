
public class ExceptionEx09 {

	public static void main(String[] args) {

		System.out.println("no exception occurred");
		System.out.println("프로그램 실행");
		
		try {
		System.out.println("1");
		}catch(Exception e) {
			System.out.println("예외처리");
		}finally {
			System.out.println("중요 메시지");
		}
		System.out.println("프로그램 종료");
		
		System.out.println("==========");
		System.out.println("exception occurred");
		System.out.println("프로그램 실행");
		
		try {
			System.out.println("1");
			System.out.println(50/0);
			System.out.println("2");
			
		}catch(Exception e) {
			System.out.println("예외처리");
		}finally {
			System.out.println("중요 메시지");
		}
		
		System.out.println("프로그램 종료");
		
	}

}
