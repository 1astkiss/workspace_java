
public class ArrayEx05 {

	public static void main(String[] args) {

		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[score.length-1];
		int min = score[0];
		int sum = 0;
		
		for(int num:score) {
			sum += num;
		}
		

		System.out.printf("ÃÑÁ¡: %d\n", sum);
		System.out.printf("Æò±Õ: %.2f", (double) sum/score.length);
	}

}
