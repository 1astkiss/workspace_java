
public class ArrayEx04 {

	public static void main(String[] args) {

		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[score.length-1];
		int min = score[0];
		
//		for(int num:score) {
//			if(num>max) max = num;
//			else if(num<min) min = num;
//		}
		
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) max = score[i];
			else if(score[i]<min) min = score[i];
		}
//		
//		int a = 6;
//		if(a>2) System.out.println("a");
//		else if(a>5) System.out.println("b");
		
		System.out.printf("최대값: %d\n", max);
		System.out.printf("최소값: %d", min);

	}

}
