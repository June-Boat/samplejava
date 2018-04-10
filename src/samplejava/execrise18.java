package samplejava;
//两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
//a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
public class execrise18 {
	public static void main(String[] agrs) {
		for(char i='x';i<='z';i++)
			for(char j='x';j<='z';j++)
				if(i!=j)
					for(char k='x';k<='z';k++)
						if(k!=i&&k!=j)
							if(i!='x'&&k=='y')
								System.out.printf("a--%c,b--%c,c--%c",i,j,k);
	}
}
