/**
 * 
 */
package designer;

/**
 * @author June-Boat
 * 工厂方法模式，核心是一个抽象工厂类
 * 抽象工厂类负责定义创建对象的接口，具体对象的创建工作由继承抽象工厂的具体类实现
 * 优：客户端不需要负责对象的创建，从而明确了各个类的职责，如果有新的对象增加，只需增加一个具体类和具体工厂类
 * 不影响既有代码，后期维护容易，便于扩展
 * 缺：增加类，需要额外编写代码，增加工作量。
 */
interface AnimalFactory{
	Animal createAnimal();
}

class DogFactory implements AnimalFactory{
	public Animal createAnimal() {
		return new Dog();
	}
}
class CatFactory implements AnimalFactory{
	public Animal createAnimal() {
		return new Cat();
	}
}

public class FactoryDemo{
	public static void main(String[] args) {
		//使用时需要先创建一个具体工厂对象
		AnimalFactory factory=new DogFactory();
		Dog dog1=(Dog)factory.createAnimal();
		Dog dog2=(Dog)factory.createAnimal();
		dog1.eat();
		dog2.eat();
	}
}