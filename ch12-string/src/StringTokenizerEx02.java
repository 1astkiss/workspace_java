import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {

		String source = "2025-12-25 15:10:55";
		StringTokenizer st = new StringTokenizer(source, "- :");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
