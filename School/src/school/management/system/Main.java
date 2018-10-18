package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main (String arg[]) {
		
		Teacher t1 = new Teacher(1,"Lizzy",500);
		Teacher t2 = new Teacher(2,"Manny",500);
		Teacher t3 = new Teacher(3,"Gap",500);
		Teacher t4 = new Teacher(4,"Sue",500);
		
		List<Teacher> teacherList = new ArrayList<>();
		
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		
		Student s1 = new Student(1,"sam",2);
		Student s2 = new Student(2,"Dolly",2);
		Student s3 = new Student(3,"Rikum",2);
		Student s4 = new Student(4,"sammy",2);
		
		List<Student> st1 = new ArrayList<>();
		st1.add(s1);
		st1.add(s2);
		st1.add(s3);
		st1.add(s4);
		
		School scg = new School(teacherList,st1);
		System.out.println("stg money earned" + scg.getTotalMoneyEarned());
		
		s1.payFees(5000);
		System.out.println("stg money earned" + scg.getTotalMoneyEarned());
		s2.payFees(500);
		System.out.println("stg money earned" + scg.getTotalMoneyEarned());
		
		//Salary given to teacher
		t1.recieveSalary(t1.getSalary());
		System.out.println("stg gave salary to teacher" + t1.getName()+ "The amount of " +t1.getSalary() 
		+ " and now school earned "+ scg.getTotalMoneySpent());
		

		
	}

}
