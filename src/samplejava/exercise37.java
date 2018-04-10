package samplejava;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthSpinnerUI;
//有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
/*
 * 用数组man[n]表示这些排好序的人，其序号=数组下标+1；
 * man初始化为0，当man[i]==1时，视为退出，即man[i]为1是退出标志；
 * 一共两层循环，外循环由退出的人数控制，当退出n-1人时循环结束；内循环由count(未退出、被点到的人数)控制。
 * 负责点人的游标i初始化为0，指向第一个人；
 * 最后遍历man数组，找出man[i]==0的人，输出序号。
 * 也可修改程序，把报数3改为设定数变量，由用户设定。数组类型换成布尔
 */
public class exercise37 {
	public static void main(String[] args) {
		System.out.print("请输入n个人数：");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();in.close();
		int man[] = new int[n];
		System.out.println(Arrays.toString(man));
		int number=0,i=0;
		while(number<n-1) {
			int count =0;
			while(count<3) {				// 注意在count的这个循环里，由于人的编号值=其数组下标+1。	
				if(man[i]==0) { 			
					count++;				//当count三次累加后，i不能也累加3次，第三次需要对i下标所在的“人值”进行退出操作。
					if(count<3)i=(i+1)%n;	// 所以i只能累加2次，第3次不累加
				}							
				else         
					i=(i+1)%n;
			}
			man[i]=1;
			i=(i+1)%n;
			number++;
		}
		System.out.println(Arrays.toString(man));
		for (int j = 0; j < man.length; j++) {
			if(man[j]==0) {
				System.out.printf("最后一人的号码是：%d",j+1);break;
			}
		}
	}
	
}
/*以下为他人代码，更为巧妙简洁。内循环遍历数组处理巧妙
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         
        System.out.println("请输入总人数。");
        int num = in.nextInt();
         
        boolean[] man = new boolean[num];
         
        for(int i = 0; i < man.length; i++)
        {
            man[i] = true;
        }
         
        int t = 0, len = man.length;
        while(len > 1)
        {
            for(int i = 0; i < man.length; i++)
            {
                if(man[i])
                {
                    t++;
                    if(t == 3)
                    {
                        t = 0;          //重置
                        man[i] = false; //去掉此人
                        len--;          //人数减 1
                    }
                }
            }
        }
         
        System.out.println("最后的情况：" + Arrays.toString(man));
        for(int i = 0; i < man.length; i++)
        {
            if(man[i])      //最后留下来的人没有被flase
            {
                System.out.println("原来剩下的数：" + (i + 1));    //i + 1 是因为数组从 0 开始
            }
        }
    }

 */

