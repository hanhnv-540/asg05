import java.util.*;
import java.util.Date;
import  java.text.SimpleDateFormat;

public class Employee extends Person{
	protected double salary;
	
	public Employee(String name, Date birthday, double salary){
		super(name, birthday);
		this.salary = salary;
	}
	
	public double getsalary(){
		return salary;
	}
	
	public void setsalary(double sa){
		this.salary = sa;
	}
	
	public String tostring(){
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "Name: "+name + " ,Birthday: " + format.format(birthday) + " ,Salary: " + String.format("%1$,.2f VND",salary);
	}
}
