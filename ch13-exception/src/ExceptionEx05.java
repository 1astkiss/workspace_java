import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx05 {
	
	private void printData() throws IOException {
		
		// InputStreamReaderŬ������ ����Ʈ�� �о� ���ڷ� ��ȯ
		// ����Ʈ��Ʈ���� ���� ��Ʈ���� ��������ִ� �ٸ� ������ �ϴ� Ŭ����
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in)  );
		
		System.out.println("�� �Է�> ");
		// ���� ������ �о���� �޼ҵ�
		int dan = Integer.parseInt(br.readLine());
		
		System.out.println(dan + "��");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d %s\n", dan, i, dan*i, "�Դϴ�");
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
