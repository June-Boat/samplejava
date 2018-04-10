/**
 * 
 */
package review;

/**
 * @author June-Boat
 *
 */
import java.util.*;

class Cage<E> extends LinkedList<E>{}
class Animal{
	public void feedMe() {};
}
class Lion extends Animal{
	public static int i=0;
	public void feedMe() {
		System.out.println("feeding lion"+i);
	}
}
class Butterfly extends Animal{

	/* (non-Javadoc)
	 * @see review.Animal#feedMe()
	 */
	@Override
	public void feedMe() {
		System.out.println("feeding butterfly");
	}
	
}

public class WildcardsTest {
	public static void main(String[] args) {
		WildcardsTest t=new WildcardsTest();
		Cage<Lion> lioncage = new Cage<>();
		Cage<Butterfly> butterfly = new Cage<>();
		lioncage.add(new Lion());
		butterfly.add(new Butterfly());
		t.feedAnimal(lioncage);
		Cage<Animal> animalcage = new Cage<>();
		animalcage.add(new Lion());
		animalcage.add(new Butterfly());
		t.feedAnimal(animalcage);
		for(Coin c:Coin.values()) {
			System.out.println(c);
		}

		List<Integer> list = new ArrayList<Integer>();
	}
	
	void feedAnimal(Cage<? extends Animal> cage) {
		for (Animal a : cage) {
			a.feedMe();
		}
	}
	
	enum Coin{
		zero,two,three;
		
	}
}
