package entities;

public class Students {

	private String name;
	private double firsttrimester;
	private double secondtrimester;
	
	public Students(String name, double firsttrimester, double secondtrimester) {
		this.name = name;
		this.firsttrimester = firsttrimester;
		this.secondtrimester = secondtrimester;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getFirsttrimester() {
		return firsttrimester;
	}
	
	public void setFirsttrimester(double firsttrimester) {
		this.firsttrimester = firsttrimester;
	}
	
	public double getSecondtrimester() {
		return secondtrimester;
	}
	
	public void setSecondtrimester(double secondtrimester) {
		this.secondtrimester = secondtrimester;
	}
	
	public double finalGrade() {
		return (firsttrimester + secondtrimester) / 2;
	}
}
