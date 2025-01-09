import java.lang.Cloneable;

class Student implements Cloneable{
	String name;
	int standard;

	public Student(String name, int standard){
		this.name = name;
		this.standard = standard;
	}


	public Student getDuplicate(){
		try{
			return (Student) super.clone();	
		}catch(Exception e){return null;}
	}
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Standard : "+standard);
	}
}

public class MarkerInterface{
	public static void main(String[] args){
		Student s1 = new Student("Sancho", 11);
		//Student s2 = s1.clone();	//Error
		Student s2 = s1.getDuplicate();
		s1.display();
		s2.display();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}