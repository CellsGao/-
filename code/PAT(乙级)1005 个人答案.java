import java.util.*;
//将原数组复制一份，使用1001中的程序进行判断，如果在判断过程中出现了clone数组中的数，则将其赋值为-1(因为该题中不可能出现-1)，然后所有
//clone数组中的值即为关键数，进行排列后倒序输出即可.
public class Main { 
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int []aim=new int[num];
		int []clone=new int[num];
		int count=0;
		for(int i=0;i<num;i++)
		{
			aim[i]=in.nextInt();
			clone[i]=aim[i];
		}
		for(int i=0;i<aim.length;i++)
		{
			while(aim[i]!=1)
			{
				if(aim[i]%2==0)
				{
					aim[i]/=2;
					for(int j=0;j<num;j++)
					{
						if(clone[j]==aim[i])
						{
							clone[j]=0;
						}
					}
				}else
				{
					aim[i]=(3*aim[i]+1);
					for(int j=0;j<num;j++)
					{
						if(clone[j]==aim[i])
						{
							clone[j]=0;
						}
					}
				}
			}
		}
		Arrays.sort(clone);
		List<Integer> list=new ArrayList<Integer>();
		for(int i=clone.length-1;i>0;i--)
		{
			if(clone[i]!=0)
			{
				list.add(clone[i]);
			}
		}
		for(int i=0;i<list.size();i++)
		{
			if(i!=list.size()-1)
			{
				System.out.print(list.get(i)+" ");
			}else
			{
				//System.out.print(list.get(i));
			}
		}
	}
}
