import java.util.StringTokenizer;

public class StringTokenizerEx03 {

	public static void main(String[] args) {
		StringTokenizerEx03 st1 = new StringTokenizerEx03("Mirry Christmas!!!");
		st1.print();
		
		StringTokenizerEx03 st2 = new StringTokenizerEx03("2017/12/25", "/");
		st2.print();
	}
	
	StringTokenizer st;
	
	public StringTokenizerEx03(String str) {
		System.out.println(str);
		st = new StringTokenizer(str);
	}

	public StringTokenizerEx03(String str, String delim) {
		System.out.println(str);
		st = new StringTokenizer(str, delim);
	}
	
	public void print() {
		System.out.printf("Token count:%d \n", st.countTokens());
		System.out.println("분리된 문자열: ");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
