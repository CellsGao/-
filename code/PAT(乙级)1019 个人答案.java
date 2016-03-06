给定任一个各位数字不完全相同的4位正整数，如果我们先把4个数字按非递增排序，再按非递减排序，然后用第1个数字减第2个数字，将得到一个新的数字。
一直重复这样做，我们很快会停在有“数字黑洞”之称的6174，这个神奇的数字也叫Kaprekar常数。
例如，我们从6767开始，将得到
7766 - 6677 = 1089
9810 - 0189 = 9621
9621 - 1269 = 8352
8532 - 2358 = 6174
7641 - 1467 = 6174
... ...
现给定任意4位正整数，请编写程序演示到达黑洞的过程。
输入格式：
输入给出一个(0, 10000)区间内的正整数N。
输出格式：
如果N的4位数字全相等，则在一行内输出“N - N = 0000”；否则将计算的每一步在一行内输出，直到6174作为差出现，输出格式见样例。
注意每个数字按4位数格式输出。
输入样例1：
6767
输出样例1：
7766 - 6677 = 1089
9810 - 0189 = 9621
9621 - 1269 = 8352
8532 - 2358 = 6174
输入样例2：
2222
输出样例2：
2222 - 2222 = 0000

import java.util.*;
 
public class Main {
	public static char []updown(char []a)
	{
		char []b=new char[a.length];
		int n=1;
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[a.length-n];
			n++;
		}
		return b;
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String value=in.next();
        char []temp=new char[4];
		for(int i=0;i<4;i++)
		{
			temp[i]='0';
		}
		for(int i=0;i<value.length();i++)
		{
			temp[i]=value.charAt(i);
		}
		boolean flag=true;
		if(value.equals("6174"))
		{
			flag=false;
		}
		while(flag)
		{
			Arrays.sort(temp);
			String s2=new String(temp);
			String s1=new String(Main.updown(temp));
			if(s1.equals(s2))
			{
				System.out.print(s1+" - "+s2+" = 0000");
				flag=false;
			}else
			{
				int a=Integer.parseInt(s1);
				int b=Integer.parseInt(s2);
				int c=a-b;
				System.out.println(s1+" - "+s2+" = "+c);
				String tempvalue=String.valueOf(c);
				if(c==6174)
				{
					flag=false;
				}else 
				{
					temp=new char[4];
					for(int i=0;i<4;i++)
					{
						temp[i]='0';
					}
					for(int i=0;i<tempvalue.length();i++)
					{
						temp[i]=tempvalue.charAt(i);
					}
				}
			}
		}
		
	}
}
