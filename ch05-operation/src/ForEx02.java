
public class ForEx02 {
	public static void main(String[] args) {

		System.out.println("비교 인자값 1씩 감소 시키기");

		for (int i = 5; i >= 1; i--) {
			System.out.print(i + "\t");
		}
		System.out.println("\n프로그램 종료");

		System.out.println();
		System.out.println("비교 인자값 2씩 증가 시키기");
		for (int i = 0; i <= 10; i+=2) {

			if (i % 2 == 0)
				System.out.print(i + "\t");

		}
		System.out.println("\n프로그램 종료");
	}
}