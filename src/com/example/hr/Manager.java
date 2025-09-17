package com.example.hr;

public class Manager extends Employee implements Workable {

	public Manager(String name, double salary) {
		super(name,salary);
}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.25;
	}
	
	@Override
	public String work() {
		return getName() +"is a Manager";
	}

}
