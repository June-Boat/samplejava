import java.util.Objects;

/**
 * 联系重写equals方法
 */

/**
 * @author June-Boat
 *
 */
public class Student {
	String name;
	String sex;
	int age;
	
	
	
	/**
	 * @param name
	 * @param sex
	 * @param age
	 */
	public Student(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}



	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	@Override public boolean equals(Object otherObject){
		if(this==otherObject)return true;
		if(otherObject==null)return false;
		if(getClass()!=otherObject.getClass())return false;
		Student other=(Student)otherObject;
		return Objects.equals(name,other.name)&&Objects.equals(sex,other.sex)&&age==other.age;
	}
	
	public static void main(String[] args) {
		Student s1=new Student("王一","男",14);
		Student s2=new Student("张三","男",14);
		Student s3=new Student("王一","男",14);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s1));
		System.out.println(s3.equals(s1));
	}
}
