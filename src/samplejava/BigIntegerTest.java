package samplejava;
import java.math.*;
import java.util.*;

public class BigIntegerTest {
	public static void main(String args[]) {
		
		for(int i=1;i<1000;i++)
			if(i%2==0)System.out.println(i);
		
		for(int i=1;i<=6;i++)
			for(int k=1;k<=i;k++)
				if(k==i)System.out.println(k);
				else System.out.printf("%d ",k);
		
		
	
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you need to draw");
		int k =in.nextInt();
		System.out.print("What is the highest number you can draw");
		int n = in.nextInt();
		BigInteger lottertyOdds = BigInteger.valueOf(1);
		BigDecimal xiaoshu = BigDecimal.valueOf(1.256);
		for(int i = 1;i<=k;i++)
			lottertyOdds = lottertyOdds.multiply(BigInteger.valueOf(n-i+1).divide(BigInteger.valueOf(i)));
		System.out.println("Your odds are 1 in"+lottertyOdds+".Good luck");
		

	}
}
