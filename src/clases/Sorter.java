package clases;

import java.util.ArrayList;

import interfaces.IComparisonStrategy;


public  class Sorter {
	IComparisonStrategy strategy;
	public Sorter(IComparisonStrategy strategy) {
		this.strategy=strategy;
		
		// TODO Auto-generated constructor stub
	}
	
	public void setStrategy(IComparisonStrategy strategy){
		this.setStrategy(strategy);
	}
	
<<<<<<< HEAD
	
	public ArrayList<Student> Sort(ArrayList<Student> a){
		
		for (int i = 0; i < a.size(); i++) {
			for (int j = i+1; j < a.size(); j++) {
				if (strategy.comparisonf(a.get(i), a.get(j))>0) {
					a.add(i,a.get(j));
					a.remove(j+1);
				}
			}			
		}
		return a;
		
		
=======

	
	public ArrayList<Student> Sort(ArrayList<Student> a){
>>>>>>> refs/remotes/origin/ordenar1.1
		
		for (int i = 0; i < a.size(); i++) {
			for (int j = i+1; j < a.size(); j++) {
				if (strategy.comparisonf(a.get(i), a.get(j))>0) {
					a.add(i,a.get(j));
					a.remove(j+1);
				}
			}			
		}
		return a;
	}



}
