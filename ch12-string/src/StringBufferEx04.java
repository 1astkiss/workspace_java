
public class StringBufferEx04 {

	public static void main(String[] args) {

		StringBuffer str01 = new StringBuffer();
		StringBuffer str02 = new StringBuffer("Java");
		StringBuilder str00 = new StringBuilder();
		System.out.println(str01.capacity());
		System.out.println(str02.capacity());
		System.out.println(str00.capacity());
		
		StringBuffer str03 = new StringBuffer("Java Á¤º¹!!!");
		System.out.println(str03);
		System.out.println(str03.insert(4, "Script"));
		
		StringBuffer str04 = new StringBuffer("CodeDragon");
		System.out.println(str04);
		System.out.println(str04.reverse());
	}

}
