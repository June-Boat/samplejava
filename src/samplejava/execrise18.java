package samplejava;
//����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ���������������������Ա����������������
//a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
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
