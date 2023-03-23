package Collections.com.testyantra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	int age;
	String name;
	int id;
	Student(int age,String name,int id){
		this.age=age;
		this.name=name;
		this.id=id;
	}
 
	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + ", id=" +id +"]";
	}
	public static void main(String[] args) {
		ArrayList<Student> ai=new ArrayList();
		ai.add(new Student(21,"tippu",109));
		ai.add(new Student(19,"veni",104));
		ai.add(new Student(18,"raju",102));
		ai.add(new Student(22,"rani",101));
		ai.add(new Student(25,"sitha",108));
		
		Collections.sort(ai,new sortonname());
		System.out.println("========== sorted based on name =========");
		for(Object s : ai) {
			System.out.println(s);
		
		}
		
		Collections.sort(ai,new sortonage());
		System.out.println("========== sorted based on age =========");
		for(Student s1 : ai) {
			System.out.println(s1);
		
		}
	}
}

 class sortonname implements Comparator <Student>
{

	
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}

	

}
 class sortonage implements Comparator <Student>
 {

 	
 	@Override
 	public int compare(Student o1, Student o2) {
 		
 		return o1.age-o2.age ;
 	}

 	

 }
