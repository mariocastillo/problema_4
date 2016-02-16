package clases;

import java.util.ArrayList;

public class StrategyFinal {
	
	
	public static void main(String[] args) {
		Sorter a=new Sorter(new OrderbyCareer());
		Student n;
		
		ArrayList<Student> sList = new ArrayList<Student>();
		Student mario= new Student("Mario Ernesto","Ingenieria Electronica", 22);
		Student oscar= new Student("Oscar Andres","Ingenieria Electronica",23);
		sList.add(mario);
		sList.add(oscar);
		mario.print();
		oscar.print();
		n=a.Sort(mario, oscar);
		System.out.println(n.name);

	}

}
