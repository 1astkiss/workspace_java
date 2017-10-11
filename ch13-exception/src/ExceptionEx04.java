
public class ExceptionEx04 {

	public static void main(String[] args) {

		int var = 10;
		
		try {
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력 데이타 없슴");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}catch(NumberFormatException e) {
			System.out.println("숫자만 넣을 수 있음");
		}catch(Exception e) {
			System.out.println("나머지 예외 발생");
		}
		
		for(int i=0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("프로그램종료");
		
	}

}
