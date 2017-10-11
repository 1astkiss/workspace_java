
public class StringEx07 {

	public static void main(String[] args) {
		
		String str = "  aaaaabbAAABB  c";
		String msg1 = null;
		String msg2 = "";
		
		System.out.println(msg2);
		System.out.println(msg1);
		
		msg2 = str.replace("aa",  "b");
		System.out.println(msg2);
		
		msg1 = str.toUpperCase();
		System.out.println(msg1);
		
		msg1 = str.toLowerCase();
		System.out.println(msg1);
		
		msg1 = str.trim();
		System.out.println(msg1);
		
		msg1 = str.replace(" ", "");
		System.out.println(msg1);
		
		System.out.println(str.contains("aa"));
		
	}

}
