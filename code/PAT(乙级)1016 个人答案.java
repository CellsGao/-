正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
现给定A、DA、B、DB，请编写程序计算PA + PB。
输入格式：
输入在一行中依次给出A、DA、B、DB，中间以空格分隔，其中0 < A, B < 1010。
输出格式：
在一行中输出PA + PB的值。
输入样例1：
3862767 6 13530293 3
输出样例1：
399
输入样例2：
3862767 1 13530293 8
输出样例2：
0

import java.util.*;
 //简单题
public class Main {
	
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
		String a=in.next();
		int da=in.nextInt();
		String b=in.next();
		int db=in.nextInt();
		int []a1=new int[a.length()];
		int []b1=new int[b.length()];
		for(int i=0;i<a.length();i++)
		{
			Character cha=a.charAt(i);
			a1[i]=Integer.parseInt(cha.toString());		
		}
		for(int i=0;i<b.length();i++)
		{
			Character cha=b.charAt(i);
			b1[i]=Integer.parseInt(cha.toString());
		}
		int counta=0;
		int countb=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==da)
			{
				counta++;
			}	
		}
		for(int i=0;i<b1.length;i++)
		{
			if(b1[i]==db)
			{
				countb++;
			}	
		}
		int pa=0;
		int pb=0;
		while(counta>0)
		{
			pa+=Math.pow(10, (counta-1))*da;
			counta--;
		}
		while(countb>0)
		{
			pb+=Math.pow(10, (countb-1))*db;
			countb--;
		}
		System.out.print(pb+pa);
    }
 
}
