
public class ArrayEx07 {

	public static void main(String[] args) {
		int[][] arr = {
				{10},
				{20, 30},
				{11, 12, 13, 14, 15, 16},
				{40, 50, 60},
				{70, 80, 90, 100}
		};
		
		System.out.println("�迭�� �� ����: " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d���� ����: %d\n", i+1, arr[i].length);
		}
		
		// 2���� �迭 ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
