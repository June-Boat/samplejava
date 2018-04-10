/**
 * 
 */

/**
 * @author June-Boat
 *管理运筹学2.11方案数量
 */
public class JiSuan {
	public static void main(String[] args) {
		int num=0;
		float a1=1.7f;
	float a2=1.3f;
	float b1=2.7f;
	float b2=2.0f;
	System.out.println("    a1 a2 b1 b2 sum   least");
	for(int i=0;i<=3;i++)
		for(int j=0;j<=4;j++)
			for(int k=0;k<=2;k++)
				for(int m =0;m<=3;m++)
				{
					float sum=i*a1+j*a2+k*b1+m*b2;
					//System.out.println(sum);
					if(sum<4.8||sum>6){}
					else {
						num++;
						System.out.printf("#%-3d%-3d%-3d%-3d%-3d%-3.1f%6.1f",num,i,j,k,m,sum,6.0-sum);
						System.out.println();
					}
				}
	System.out.println("方案数有："+num);
	
	}

	
}
