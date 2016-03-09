输入两个非负10进制整数A和B(<=230-1)，输出A+B的D (1 < D <= 10)进制数。
输入格式：
输入在一行中依次给出3个整数A、B和D。
输出格式：
输出A+B的D进制数。
输入样例：
123 456 8
输出样例：
1103

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int d=in.nextInt();
		int sum=a+b;
		int remain=0;
		List<Integer> remainder=new ArrayList<Integer>();
		while(sum>=d)
		{
			remain=sum%d;
			sum=sum/d;
			remainder.add(remain);
		}
		remainder.add(sum);
		for(int i=remainder.size()-1;i>-1;i--)
		{
			System.out.print(remainder.get(i));
		}
		in.close();
	}
}
