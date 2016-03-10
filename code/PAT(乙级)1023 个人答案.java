import java.util.*;

public class Main {	
	public static void exch(Integer []a,int i,int j)
	{
		int m=a[j];
		a[j]=a[i];
		a[i]=m;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int []count=new int[10];
		for(int i=0;i<count.length;i++)
		{
			count[i]=in.nextInt();
		}
		int sum=0;
		for(int i=0;i<count.length;i++)
		{
			sum=sum+count[i];
		}
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<count.length;i++)
		{
			while(count[i]>0)
			{
				list.add(i);
				count[i]--;
			}
		}
		Integer []end=(Integer [])(list.toArray(new Integer[0]));
		for(int i=0;i<end.length;i++)
		{
			if(end[i]!=0)
			{
				exch(end,0,i);
				break;
			}
		}
		for(int i=0;i<end.length;i++)
		{
			System.out.print(end[i]);
		}
	}
}
