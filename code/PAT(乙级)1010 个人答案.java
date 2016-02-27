设计函数求一元多项式的导数。（注：xn（n为整数）的一阶导数为n*xn-1。）
输入格式：以指数递降方式输入多项式非零项系数和指数（绝对值均为不超过1000的整数）。数字间以空格分隔。
输出格式：以与输入相同的格式输出导数多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。
注意“零多项式”的指数和系数都是0，但是表示为“0 0”。
输入样例：
3 4 -5 2 6 1 -2 0
输出样例：
12 3 -10 1 6 0


import java.util.*;
//比较困难，此程序只能得15分，主体思路是将输入读取为字符串，字符串去除空格后复制进ArrayList，偶数位值为系数，奇数位置为指数
//当偶数或奇数位置之一为0时，将其一对从数组中除去，然后其他按求导法则计算。
public class Main { 
	
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		//数字们录入数组，去掉空格
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' '&&str.charAt(i)!='-')
			{
				Character cha=str.charAt(i);
				list.add(Integer.parseInt(cha.toString()));
			}else if(str.charAt(i)=='-')//判断负号，负号后的数字为负数，计算中取反
			{
				Character cha=str.charAt(i+1);
				list.add(-Integer.parseInt(cha.toString()));//此为将负数输入进数组
				i++;
			}
		}
		//将奇数或偶数位置上为0的系数，质数组合踢出数组。
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==0&&i%2!=0&&list.gei(i-1)!=0)
			{
				list.remove(i);
				list.remove(i-1);	
			}else if(list.get(i)==0&&i%2==0&&list.get(i+1)!=0)
			{
				list.remove(i+1);
				list.remove(i);
			}
		}
		int []number=new int[list.size()];
		//求导算法 
		for(int i=0;i<list.size();i++)
		{
			number[i]=list.get(i);
		}
		for(int i=0;i<list.size();i++)
		{
			if(number[i]!=0&&i%2==0&&number[i+1]!=0)
			{
				number[i]=number[i]*number[i+1];
				number[i+1]=number[i+1]-1;
			}
		}
		for(int i=0;i<list.size()-1;i++)
		{
			System.out.print(number[i]+" ");
		}
		System.out.print(number[list.size()-1]);
	}
}
