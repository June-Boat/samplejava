/**
 * 
 */
package exercise;

/**
 * @author June-Boat
 *
 */
enum Spiciness{
	NOT,MILD,MEDIUM,HOT,FLAMING
}

public class EnumOrder {
	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s+" "+s.ordinal());
		}
		Spiciness s= Spiciness.NOT;
		switch (s) {
		case NOT:
			System.out.println("zheshi "+s);
			break;
		case MILD:
			System.out.println("zheshi "+s);
			break;
		case MEDIUM:
			System.out.println("zheshi "+s);
			break;
		case HOT:
			System.out.println("zheshi "+s);
			break;
		case FLAMING:
			System.out.println("zheshi "+s);
			break;

		default:
			break;
		}
	}
}
