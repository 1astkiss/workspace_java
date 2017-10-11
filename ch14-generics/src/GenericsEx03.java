
class GenericsEx<T> {
	T[] v;
	
	public void set(T[] generic) {
		v = generic;
	}
	
	public void print() {
		for(T s : v) {
			System.out.println(s);
		}
	}
}

public class GenericsEx03 {

	public static void main(String[] args) {

		GenericsEx t = new GenericsEx();
		
		String[] strArr = {"°¡", "³ª", "´Ù"};
		
		t.set(strArr);
		t.print();
		
		Integer[] intArr = {1,2,3};
		t.set(intArr);
		t.print();
		
		GenericsEx<String> u = new GenericsEx<String>();
		u.set(strArr);
		u.print();
	}

}
