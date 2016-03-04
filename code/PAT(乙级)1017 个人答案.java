本题要求计算A/B，其中A是不超过1000位的正整数，B是1位正整数。你需要输出商数Q和余数R，使得A = B * Q + R成立。
输入格式：
输入在1行中依次给出A和B，中间以1空格分隔。
输出格式：
在1行中依次输出Q和R，中间以1空格分隔。
输入样例：
123456789050987654321 7
输出样例：
17636684150141093474 3

import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
		String str=in.next();
		int b=in.nextInt();
		int []a=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			Character cha=str.charAt(i);
			a[i]=Integer.parseInt(cha.toString());
		}
		int []shang=new int[str.length()];
		int []yushu=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			int yushu1=0;
			if(i==0)
			{
				shang[i]=a[i]/b;
			}
			else if(i!=0)
			{
				shang[i]=((10*yushu[i-1])+a[i])/b;
			}
			if(i==0)
			{
				yushu1=a[i]%b;
			}else 
			{
				yushu1=((10*yushu[i-1])+a[i])%b;
			}
			yushu[i]=yushu1;
		}
	List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<shang.length;i++)
		{
			list.add(shang[i]);
		}
		if(list.get(0)==0)
		{
			list.remove(0);
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
			if(i==list.size()-1)
			{
				System.out.print(" ");
			}
		}
		System.out.print(yushu[str.length()-1]);
    }
 
}
