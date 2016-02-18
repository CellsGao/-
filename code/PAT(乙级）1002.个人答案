import java.util.*;
//使用switch，过于繁琐并且由于数据类型限制，无论int，double输入过长数字都会导致java认为输入的是一个字符串，导致输入错误
//不是一个完全正确的答案。
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;	
		}
		String str=""+sum;
		for(int i=0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
			case '0':System.out.print("ling"+" ");break;
			case '1':System.out.print("yi"+" ");break;
			case '2':System.out.print("er"+" ");break;
			case '3':System.out.print("san"+" ");break;
			case '4':System.out.print("si"+" ");break;
			case '5':System.out.print("wu"+" ");break;
			case '6':System.out.print("liu"+" ");break;
			case '7':System.out.print("qi"+" ");break;
			case '8':System.out.print("ba"+" ");break;
			}
		}
		System.out.println(sum);
	}
}
