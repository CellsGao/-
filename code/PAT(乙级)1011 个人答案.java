import java.util.*;
//简单题，使用二维数组存储数据
public class Main { 
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		long [][]a=new long[num][3];
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<num;i++)
		{
			boolean flag=true;
			if(a[i][0]+a[i][1]>a[i][2])
			{
				System.out.println("Case"+" "+"#"+(i+1)+":"+" "+flag);
			}else if(a[i][0]+a[i][1]<=a[i][2])
			{
				flag=false;
				System.out.println("Case"+" "+"#"+(i+1)+":"+" "+flag);
			}
		}
	}
}
