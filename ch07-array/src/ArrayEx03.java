
public class ArrayEx03 {

	public static void main(String[] args) {

		int[] a = {10,20,30,40,50,60,70};
		
		System.out.println(a);
		System.out.println(java.util.Arrays.toString(a));
		
		for(int num = 0; num < a.length; num++) {
			System.out.println(a[num]);
		}
		
		for(int num : a) {
			System.out.println(num);
		}
	}

}
