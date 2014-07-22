import java.util.*;
import java.util.Date;
import  java.text.SimpleDateFormat;

public class Person{
	protected String name;
	protected Date birthday;
	
	public Person(String yname, Date ybirthday ){
		this.name = yname;
		this.birthday = ybirthday;
	}
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public Date getbirthday(){
		return birthday;
	}
	
	public void setbirthday(Date birthday){
		this.birthday = birthday;
	}
	
	public String tostring(){
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "Name: "+name + " ,Birthday: " + format.format(birthday);
	}
}