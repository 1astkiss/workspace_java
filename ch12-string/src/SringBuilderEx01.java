
public class SringBuilderEx01 {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder("Orange");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.hashCode());
		stringBuilder.append(27);
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.hashCode());
		
		String stringBuilder1 = new String("Orange");
		System.out.println(stringBuilder1);
		System.out.println(stringBuilder1.hashCode());
		stringBuilder1 = stringBuilder1.concat("27");
		System.out.println(stringBuilder1);
		System.out.println(stringBuilder1.hashCode());
		
		stringBuilder.append("J").append(true);
		System.out.println(stringBuilder);
		stringBuilder.insert(9,  "ava");
		System.out.println(stringBuilder);
		
		stringBuilder.insert(stringBuilder.length(), "Z");
		System.out.println(stringBuilder);
		
	}

}
