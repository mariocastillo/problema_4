package clases;

import java.util.ArrayList;

public class StrategyFinal {
	
	
	public static void main(String[] args) {
		Sorter a=new Sorter(new OrderbyAge());
		ArrayList<Student> n;
		
		ArrayList<Student> sList = new ArrayList<Student>();
		Student mario= new Student("Mario Ernesto","Cngenieria Electronica", 24);
		Student oscar= new Student("Oscar Andres","Cnagenieria Electronica",23);
		Student alejo= new Student("Manuel Alejandro","Angenieria Electronica",21);
		sList.add(mario);
		sList.add(oscar);
		sList.add(alejo);

		n=a.Sort(sList);
		
		for (Student student : n) {
			System.out.println(student.carrer);
			
		}
		

	}

}
