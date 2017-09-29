
public class ArrayEx08 {

	public static void main(String[] args) {

		
		String[] programlist = new String[3];
		
//		char[] charr = {'C', 'S', 'h', 'a', 'r', 'p'};
		programlist[0] = "CSharp";
		programlist[1] = "Python";
		programlist[2] = "Java";
		
		for(String e : programlist) {
			System.out.println(e);
		}
	}

}
