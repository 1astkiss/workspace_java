
public class IfEx03 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		int score;
		char grade;
		System.out.print("점수는? > ");
		score = input.nextInt();

		if (score >= 90) {
			grade = 'A';
			System.out.printf("%s학점입니다\n", grade);
		} else if (score >= 80) {
			grade = 'B';
			System.out.printf("%s학점입니다\n", grade);
		} else if (score >= 70) {
			grade = 'C';
			System.out.printf("%s학점입니다\n", grade);
		} else if (score >= 60) {
			grade = 'D';
			System.out.printf("%s학점입니다\n", grade);
		} else {
			grade = 'F';
			System.out.printf("%s학점입니다\n", grade);
		}
	}

}
