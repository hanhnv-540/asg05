import java.util.*;
import java.util.Date;

public class PeopleTest{
	public static void main(String [] args){
		Person[] p = new Person[3];
		Employee newbie = new Employee("newbie", new Date("2/10/1989"), 1000000);
		Manager boss = new Manager("boss", new Date("2/23/1986"), 4000000);
		boss.setAssistant(newbie);
		Manager bigboss = new Manager("bigboss", new Date("3/12/1969"), 10000000);
		bigboss.setAssistant(boss);
		for (int i=0; i<3; i++){
			if (i==0){
				p[i] = newbie;
			}
			if (i==1){
				p[i] = boss;
			}
			if (i==2){
				p[i] = bigboss;
			}
			System.out.println(p[i].tostring());
		}
		//System.out.println(newbie.tostring());
		//System.out.println(boss.tostring());
		//System.out.println(bigboss.tostring());
	}
}