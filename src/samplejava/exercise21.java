package samplejava;
//Çó1+2!+3!+...+20!µÄºÍ¡£
public class exercise21 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=exp(i);
		}
		System.out.println(sum);
	}
	private static int exp(int n) {
		if(n==1)return 1;
		else return n*exp(n-1);
	}
}
