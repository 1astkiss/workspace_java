
class Num{
	public int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}


public class ArrayEx10 {

	public static void main(String[] args) {
		
	 	Num[] arr = new Num[3];
	 	
	 	arr[0] = new Num(10);
	 	arr[1] = new Num(20);
	 	arr[2] = new Num(30);
	 	
	 	// Num e = new Num(10)
	 	for( Num e : arr) {
	 		System.out.println(e.getNum());
	 	}
	 	
	}

}
