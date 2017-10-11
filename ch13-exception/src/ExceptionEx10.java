@SuppressWarnings("serial")
class UserException extends Exception {

	public UserException(String str) {
		super(str);
	}
}

public class ExceptionEx10 {S

	public static void main(String[] args) {

		int a = -11;
		
		try {
			if(a <= 0 ) {
			throw new UserException("양수가 아닙니다.");
			}
		}catch(UserException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(a);
	}

}
