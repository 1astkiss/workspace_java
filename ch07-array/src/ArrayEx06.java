import java.util.Arrays;

public class ArrayEx06 {
	static int zz = 2;
	int xx = 1;

	static {
		zz = 11;
		yy = 13;
	}
	
	{
		xx = 12;
	}
	
	static int yy = 3;

	public static void main(String[] args) {

		int[][] aa = new int[][] { { 1, 2, 3 }, { 4, 5 } };

		System.out.println(Arrays.toString(aa[0]));
		System.out.println(Arrays.toString(aa[1]));
		System.out.println(zz);
		System.out.println(yy);
		System.out.println(new ArrayEx06().xx);

	}

}
