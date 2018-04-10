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
	private transient int age;// ��Ԫ�ز��ᱻjvm�Զ����л�

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
		s.defaultWriteObject();//��jvm����Ĭ�����л���Ԫ�ؽ������в���
		s.writeInt(age);//�Լ����age�����л�����
	}

	private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
		s.defaultReadObject();//��jvm����Ĭ�Ϸ����л���Ԫ�ؽ��з����в���
		this.age=s.readInt();//�Լ����age�ķ����л�����
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
