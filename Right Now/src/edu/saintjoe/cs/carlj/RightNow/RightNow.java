package edu.saintjoe.cs.carlj.RightNow;

public class RightNow {
	//had to use this project as the phone homework
	//because I could not merge the java and github 
	//repos together for the life of me
	
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
	

	
	
	
	
