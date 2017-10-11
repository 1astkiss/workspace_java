
// ���׸� Ŭ���� ��� �ܰ�
// TODO 1: ���ø� ������ �ڷ��� Ŭ���� ����
// TODO 2: ���ø� ������ �ڷ��� Ŭ������ �ʿ��� ����ʵ�� ����޼ҵ� ���� 

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
		
		mg1.setElement("�ȵ���̵�");
		System.out.println(mg1.getElement());
		
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>(3);
		System.out.println(mg2.getElement());
		mg2.setElement(2017);
		System.out.println(mg2.getElement());
		
	}

}
