package edu.saintjoe.cs.carlj.RightNow;

public class RightNow {
	//this is just a pretend project
	
	public final String name;
	
	public Object year;
	
	public RightNow(String name) {
		this.name = name;
	}
	
	public RightNow (String name, Object year) {
		this.name = name;
		this.year = year;
		
}
	
	public String getname() {
		return name;
	}
	
	public Object getyear() {
		return year;
	}
	
	public String toString() {
		return name + "='" + year + "'";
	}
}
	

	
	
	
	
