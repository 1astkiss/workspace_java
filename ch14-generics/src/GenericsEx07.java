import java.util.ArrayList;

class LandAnimal{
	public void crying() {
		System.out.println("��������");
	}
}

class Cat extends LandAnimal {

	@Override
	public void crying() {
		System.out.println("�����");
	}
}

class Dog extends LandAnimal {

	@Override
	public void crying() {
		System.out.println("������");
	}
}

class Dolphin {
	public void crying() {
		System.out.println("����");
	}
}

class AnimalList<T>	{
	ArrayList<T> al = new ArrayList<T>();
	
	void add(T animal) {
		al.add(animal);
	}
	
	T get(int index) {
		return al.get(index);
	}
	
	boolean remove(T animal) {
		return al.remove(animal);
	}
	
	int size() {
		return al.size();
	}
}

public class GenericsEx07 {

	public static void main(String[] args) {
		AnimalList<LandAnimal> landAnimal = new AnimalList<>();
		
		landAnimal.add(new LandAnimal());
		landAnimal.add(new Cat());
		landAnimal.add(new Dog());
//		landAnimal.add(new Dolphin());
		
		for(int i=0; i < landAnimal.size(); i++) {
			landAnimal.get(i).crying();
		}
	}
}
