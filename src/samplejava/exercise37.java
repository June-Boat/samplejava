package samplejava;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthSpinnerUI;
//��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
/*
 * ������man[n]��ʾ��Щ�ź�����ˣ������=�����±�+1��
 * man��ʼ��Ϊ0����man[i]==1ʱ����Ϊ�˳�����man[i]Ϊ1���˳���־��
 * һ������ѭ������ѭ�����˳����������ƣ����˳�n-1��ʱѭ����������ѭ����count(δ�˳������㵽������)���ơ�
 * ������˵��α�i��ʼ��Ϊ0��ָ���һ���ˣ�
 * ������man���飬�ҳ�man[i]==0���ˣ������š�
 * Ҳ���޸ĳ��򣬰ѱ���3��Ϊ�趨�����������û��趨���������ͻ��ɲ���
 */
public class exercise37 {
	public static void main(String[] args) {
		System.out.print("������n��������");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();in.close();
		int man[] = new int[n];
		System.out.println(Arrays.toString(man));
		int number=0,i=0;
		while(number<n-1) {
			int count =0;
			while(count<3) {				// ע����count�����ѭ��������˵ı��ֵ=�������±�+1��	
				if(man[i]==0) { 			
					count++;				//��count�����ۼӺ�i����Ҳ�ۼ�3�Σ���������Ҫ��i�±����ڵġ���ֵ�������˳�������
					if(count<3)i=(i+1)%n;	// ����iֻ���ۼ�2�Σ���3�β��ۼ�
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
				System.out.printf("���һ�˵ĺ����ǣ�%d",j+1);break;
			}
		}
	}
	
}
/*����Ϊ���˴��룬��Ϊ�����ࡣ��ѭ���������鴦������
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         
        System.out.println("��������������");
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
                        t = 0;          //����
                        man[i] = false; //ȥ������
                        len--;          //������ 1
                    }
                }
            }
        }
         
        System.out.println("���������" + Arrays.toString(man));
        for(int i = 0; i < man.length; i++)
        {
            if(man[i])      //�������������û�б�flase
            {
                System.out.println("ԭ��ʣ�µ�����" + (i + 1));    //i + 1 ����Ϊ����� 0 ��ʼ
            }
        }
    }

 */

