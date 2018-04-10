/**
 * 
 */
package designer;

/**
 * @author June-Boat
 * 简单工厂模式，又称静态工厂方法模式，
 * 定义一个具体的工厂类负责创建一些类的实例
 * 优：客户端不需要负责对象的创建，从而明确了各个类的职责
 * 缺：该静态工厂类负责所有对象的创建，如果有新的对象增加
 * 或创建方式不同，则需要修改源码
 */
interface Animal{
	void eat();
}
class Dog implements Animal{
	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}
}
class Cat implements Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
class AnimalSimpleFactory{
	//对每个类编写各自的创建对象方法，多个类时方法冗余，复用性不高
	public static Dog createDog() {
		return new Dog();
	}
	public static Cat createCat() {
		return new Cat();
	}
	//改进，一个方法创建一个类群，但增加一个类别，要修改方法内的判断逻辑
	public static Animal createAnimal(String name) {
		if("Dog".equals(name))return new Dog();
		else if("Cat".equals(name))return new Cat();
		else return null;
	}
}

public class SimpleFactoryDemo {
	public static void main(String[] args) {
		Dog dog=AnimalSimpleFactory.createDog();
		Cat cat=AnimalSimpleFactory.createCat();
		dog.eat();
		cat.eat();
		Dog dog2=(Dog)AnimalSimpleFactory.createAnimal("Dog");
		dog2.eat();
	}
	
}
