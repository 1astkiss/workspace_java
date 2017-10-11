
class StudentInfo {
	public int grade;
	
	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class StudentPerson {
	public StudentInfo info;
	
	StudentPerson(StudentInfo info){
		this.info = info;
	}
}

class EmployeeInfo {
	public int position;
	
	EmployeeInfo(final int position) {
		this.position = position;
	}
}

class EmployeePerson {
	public EmployeeInfo info;
	
	EmployeePerson(EmployeeInfo info) {
		this.info = info;
	}
}

class Person<T> {
	public T info;
	
	Person(T info) {
		this.info = info;
	}
}

public class GenericsEx04 {

	public static void main(String[] args) {

		StudentInfo si = new StudentInfo(10);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);
		
		EmployeeInfo ei = new EmployeeInfo(20);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.position);
		
		
	}

}
