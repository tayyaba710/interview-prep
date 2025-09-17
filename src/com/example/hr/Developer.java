package com.example.hr;

public class Developer extends Employee implements Workable{

	
	public Developer(String name, double salary)
	{
		super(name,salary);
	}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.20;
	}
	
	@Override
	public String work() {
		return getName() +"is a dveloper";
	}


}
