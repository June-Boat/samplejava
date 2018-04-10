/**
 * 
 */

/**
 * @author June-Boat
 *
 */
public class regts {
	public static void main(String[] args) {
		String regx="^[a-zA-Z]\\w{5,17}";
		String test="june_aotj_iooj_ljlk_46";
		boolean flag= test.matches(regx);
		System.out.println(flag);
	}
}
