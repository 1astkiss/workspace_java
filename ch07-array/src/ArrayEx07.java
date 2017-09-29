
public class ArrayEx07 {

	public static void main(String[] args) {
		int[][] arr = {
				{10},
				{20, 30},
				{11, 12, 13, 14, 15, 16},
				{40, 50, 60},
				{70, 80, 90, 100}
		};
		
		System.out.println("배열의 행 길이: " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의 길이: %d\n", i+1, arr[i].length);
		}
		
		// 2차월 배열 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
