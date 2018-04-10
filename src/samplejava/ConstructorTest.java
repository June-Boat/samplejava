package samplejava;
import java.lang.*;
import java.util.Random;

public class ConstructorTest {
	public static void main(String[] agrs) {
	Employee[] staff = new Employee[3];
	staff[0]=new Employee("Harry",40000);
	staff[1]=new Employee(60000);
	staff[2]=new Employee();
	for(Employee e: staff)
		System.out.println("name="+e.getName()+",id="+e.getId()+", salary="+e.getSalary());
	}
}

class Employee{
	private static int nextId;
	
	private int id;
	private String name="";
	private double salary;
	
	static
	{
		Random random= new Random();
		nextId = random.nextInt(10000);
	}
	
	{
		id=nextId;
		nextId++;
	}
	
	public Employee() {
		
	}
	
	public Employee(double s) {
		this("Employee#"+nextId,s);
	}
	
	public Employee(String n,double s)
	{
		name = n;salary= s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
}