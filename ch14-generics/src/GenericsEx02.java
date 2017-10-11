
// 제네릭 클래스 사용 단계
// TODO 1: 템플릿 형태의 자료형 클래스 정의
// TODO 2: 템플릿 형태의 자료형 클래스에 필요한 멤버필드와 멤버메소드 정의 

class MyGeneric<T> {
	
	private T element;
	
	public MyGeneric(T data){
		element = data;
	}
	
	public void setElement(T data) {
		element = data;
	}
	
	public T getElement() {
		return element;
	}
}

public class GenericsEx02 {

	public static void main(String[] args) {

		MyGeneric<String> mg1 = new MyGeneric<String>("ttt");
		
		System.out.println(mg1.getElement());
		
		mg1.setElement("안드로이드");
		System.out.println(mg1.getElement());
		
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>(3);
		System.out.println(mg2.getElement());
		mg2.setElement(2017);
		System.out.println(mg2.getElement());
		
	}

}
