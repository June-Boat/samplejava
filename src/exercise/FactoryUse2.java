/**
 * 
 */
package exercise;

/**
 * @author June-Boat
 *
 */


class Unicycle2 implements Cycle{
	public void run() {
		System.out.println("Unicycle running");		
	}
	public static CycleFactory cf= new CycleFactory() {
		public Cycle getCycle() {
			return new Unicycle2();
		}
	};
}

class Bicycle2 implements Cycle{
	public void run() {
		System.out.println("Bicycle running");		
	}
	public static CycleFactory cf= new CycleFactory() {
		public Cycle getCycle() {
			return new Bicycle2();
		}
	};
}

class Tricycle2 implements Cycle{
	public void run() {
		System.out.println("Tricycle running");		
	}
	public static CycleFactory cf= new CycleFactory() {
		public Cycle getCycle() {
			return new Tricycle2();
		}
	};
}

public class FactoryUse2 {
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
