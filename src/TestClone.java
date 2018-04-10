/**
 * 
 */

/**
 * @author June-Boat
 *对象的深克隆，克隆Employee里的Address对象
 */
class Address implements Cloneable {
	/**
	 * @return the state
	 */
	private String state;
	private String province;
	private String city;

	protected Address clone() throws CloneNotSupportedException {
		Address address=null;
		address =(Address)super.clone();
		return address;
	}
	
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param province
	 *            the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param state
	 * @param province
	 * @param city
	 */
	public Address(String state, String province, String city) {
		super();
		this.state = state;
		this.province = province;
		this.city = city;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [state=" + state + ", province=" + province + ", city=" + city + "]";
	}
	
}

class Employee implements Cloneable {
	private String name;
	private int age;
	private Address address;

	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("姓名" + name + ",");
		sb.append("年龄" + age + "\n");
		sb.append("地址" + address);
		return sb.toString();
	}

	public Employee clone() {
		Employee employee = null;
		try {
			employee = (Employee) super.clone();
			employee.address=address.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return employee;
	}
}

public class TestClone {
	public static void main(String[] args) {
		System.out.println("克隆之前");
		Address address = new Address("中国", "四川", "成都");
		Employee employee1 = new Employee("张下", 30, address);
		System.out.println();
		System.out.println(employee1);
		System.out.println("克隆之后,");
		Employee employee2 = employee1.clone();
		employee2.getAddress().setState("中国");
		employee2.getAddress().setProvince("广东");
		employee2.getAddress().setCity("深圳");
		employee2.setAge(22);
		System.out.println("员工1：");
		System.out.println(employee1);
		System.out.println("员工2：");
		System.out.println(employee2);

	}
}
