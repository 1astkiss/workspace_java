import java.util.Vector;

public class GenericsEx01 {

	public static void main(String[] args) {

		Vector<String> gen = new Vector<String>();
		
		gen.add("대한민국");
		gen.add("미국");
		gen.add("중국");
		
		System.out.println(gen.size());
		String tmp;
		
		for(int i=0; i < gen.size(); i++) {
			System.out.println(gen.get(i));
		}
	}

}
