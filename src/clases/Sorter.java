package clases;

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
	

	public Student Sort(Student a,Student b){
		if (strategy.comparisonf(a, b)<0) {
			return a;
		}
		else if (strategy.comparisonf(a, b)>0) {
			return b;
		}
		else {
			return a;
		}
		
	}


}
