

class Number{
	
	public int num;
	
	public Number(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}


public class ArrayEx11 {

	public static void main(String[] args) {

		Number[] arr = new Number[] {
				new Number(2),
				new Number(4),
				new Number(6)
		};
		
		for(Number e : arr) {
			e.num++;
		}
		
		for(Number e : arr) {
			System.out.println(e.getNum());
		}
		
		for(Number e : arr) {
			e = new Number(7);
			e.num += 2;
			System.out.println(e.getNum());
			System.out.println(e);
		}
		
		for(Number e : arr) {
			System.out.println(e.getNum());
		}
		
	}

}
