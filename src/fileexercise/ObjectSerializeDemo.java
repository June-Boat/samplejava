/**
 * 
 */
package fileexercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author June-Boat
 *
 */

class Teacher implements Serializable{
	private String id;
	private String name;
	
	public String getId() {	return id;	}
	public void setId(String id) {this.id = id;	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Teacher(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
}

class Student implements Serializable {
	private String id;
	private String name;
	private transient int age;// 该元素不会被jvm自动序列化

	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {	return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
		s.defaultWriteObject();//让jvm把能默认序列化的元素进行序列操作
		s.writeInt(age);//自己完成age的序列化操作
	}

	private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
		s.defaultReadObject();//让jvm把能默认反序列化的元素进行反序列操作
		this.age=s.readInt();//自己完成age的反序列化操作
	}
}

public class ObjectSerializeDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Data.txt"));
//		Student stu = new Student("10001", "wangda", 18);
//		Teacher tea=new Teacher("20002","teacher");
//		oos.writeObject(stu);
//		oos.writeObject(tea);
//		oos.flush();
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Data.txt"));
		Student stucopy = (Student) ois.readObject();
		Teacher teacopy = (Teacher) ois.readObject();
		ois.close();
		System.out.println(stucopy);
		System.out.println(teacopy);
	}
}
