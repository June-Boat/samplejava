/**
 * 
 */
package exercise;

/**
 * @author June-Boat
 *
 */
interface Cycle{
	void run();
}
interface CycleFactory{
	Cycle getCycle();
}


class Unicycle implements Cycle{
	public void run() {
		System.out.println("Unicycle running");		
	}
}

class Bicycle implements Cycle{
	public void run() {
		System.out.println("Bicycle running");		
	}
}

class Tricycle implements Cycle{
	public void run() {
		System.out.println("Tricycle running");		
	}
}

class UnicycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class BicycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Bicycle();
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Tricycle();
	}
}

public class FactoryUse {
	public static void use(CycleFactory cf) {
		Cycle c=cf.getCycle();
		c.run();
	}
	public static void main(String[] args) {
		use(new UnicycleFactory());
		use(new BicycleFactory());
		use(new TricycleFactory());
	}
}
