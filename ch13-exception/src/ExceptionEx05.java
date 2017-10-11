import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx05 {
	
	private void printData() throws IOException {
		
		// InputStreamReader클래스는 바이트를 읽어 문자로 변환
		// 바이트스트림과 문자 스트림을 연결시켜주는 다리 역할을 하는 클래스
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in)  );
		
		System.out.println("단 입력> ");
		// 한줄 단위로 읽어오는 메소드
		int dan = Integer.parseInt(br.readLine());
		
		System.out.println(dan + "단");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d %s\n", dan, i, dan*i, "입니다");
		}
		
	}

	public static void main(String[] args) {
		ExceptionEx05 ex = new ExceptionEx05();
		
		try {
			ex.printData();
		}catch(IOException e) {
			
		}
	}

}
