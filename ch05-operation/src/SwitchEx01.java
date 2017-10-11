
public class SwitchEx01 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		int a;

		System.out.print("정수 입력 >");
		a = input.nextInt();

		switch (a) {
		case 1:
			System.out.println("1 입력");
//			break;

		case 2:
			System.out.println("2 입력");
//			break;

		case 3:
			System.out.println("3 입력");
//			break;

		default:
			System.out.println("잘못된 선택");

		}

	}

}
