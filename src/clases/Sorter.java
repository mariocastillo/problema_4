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
	

//	public Student Sort(Student a,Student b){
//		if (strategy.comparisonf(a, b)<0) {
//			return a;
//		}
//		else if (strategy.comparisonf(a, b)>0) {
//			return b;
//		}
//		else {
//			return a;
//			}
//  	}
	
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
		
		
//		if (strategy.comparisonf(a, b)<0) {
//			return a;
//		}
//		else {
//			return b;
//		}
		
	}


}
