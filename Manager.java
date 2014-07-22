import java.util.*;
import java.util.Date;
import  java.text.SimpleDateFormat;

public class Manager extends Employee{

	private Employee assistant;
	
	public Manager(String name, Date birthday, double salary){
		super(name, birthday, salary);
	}
	
	public void setAssistant(Employee assistant){
		this.assistant = assistant;
	}
	
	public String tostring(){
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "Name: "+name + " ,Birthday: " + format.format(birthday) + " ,Salary: " + String.format("%1$,.2f VND",salary);
	}
}