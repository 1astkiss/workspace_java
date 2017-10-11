
public class ExceptionEx08 {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);
			System.out.printf("인자 : %d\n", num);
		}catch(Exception e) {
			System.out.println("매개변수 오류");
		}finally {
			System.out.println("프로그램 종료");
			System.out.println("시스템 자원 정리");
		}
	}

}
