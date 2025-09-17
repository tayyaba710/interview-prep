package com.example.hr;


public class Main {
	
	public static void main(String[] args) {
		Employee e1 = new Developer("Tayyaba", 5000);
		Employee e2 = new Manager("kouser", 9000);
		
		System.out.println(e1.getName()+" " + "is earning" + " " +e1.getSalary());
		System.out.println(e2.getName()+ " "+"is earning" + " "+e2.getSalary());
		
		System.out.println(e1.getName()+ " "+ "got the bonus of"+ " " +e1.calculateBonus() + "and" + ((Workable)e1).work());
		
	}
	


}
