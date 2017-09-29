
public class ArrayEx09 {
	
	public static void main(String[] args) {

		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[] {1, 2, 3, 4, 5};
		
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] +=10;
		}
		
		
		for(int e : arr2) {
			e += 10;
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
