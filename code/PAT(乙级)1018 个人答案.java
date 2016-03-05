给出两人的交锋记录，请统计双方的胜、平、负次数，并且给出双方分别出什么手势的胜算最大。
输入格式：
输入第1行给出正整数N（<=105），即双方交锋的次数。随后N行，每行给出一次交锋的信息，即甲、乙双方同时给出的的手势。
C代表“锤子”、J代表“剪刀”、B代表“布”，第1个字母代表甲方，第2个代表乙方，中间有1个空格。
输出格式：
输出第1、2行分别给出甲、乙的胜、平、负次数，数字间以1个空格分隔。
第3行给出两个字母，分别代表甲、乙获胜次数最多的手势，中间有1个空格。如果解不唯一，则输出按字母序最小的解。
输入样例：
10
C J
J B
C B
B B
B C
C C
C B
J B
B C
J J
输出样例：
5 3 2
2 3 5
B B

import java.util.*;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String []str=new String[2*n];
		for(int i=0;i<str.length;i++)
		{
			str[i]=in.next();
		}
		List<String> awinnumber=new ArrayList<String>();
		List<String> bwinnumber=new ArrayList<String>();
		int awin=0;
		int bwin=0;
		int adogfall=0;
		int bdogfall=0;
		int alose=0;
		int blose=0;
		String amax;
		String bmax;
		int []counta=new int[3];
		int []countb=new int[3];
		for(int i=0;i<str.length;i++)
		{
			if(i%2==0)
			{
				if(str[i].equals("C")&&str[i+1].equals("J"))
				{
					awin++;
					blose++;
					awinnumber.add("C");
					counta[1]++;
				}else if(str[i].equals("C")&&str[i+1].equals("B"))
				{
					bwin++;
					alose++;
					bwinnumber.add("B");
					countb[0]++;
				}else if(str[i].equals("B")&&str[i+1].equals("J"))
				{
					alose++;
					bwin++;
					bwinnumber.add("J");
					countb[2]++;
				}else if(str[i].equals("B")&&str[i+1].equals("C"))
				{
					awin++;
					blose++;
					awinnumber.add("B");
					counta[0]++;
				}else if(str[i].equals("J")&&str[i+1].equals("B"))
				{
					awin++;
					blose++;
					awinnumber.add("J");
					counta[2]++;
				}else if(str[i].equals("J")&&str[i+1].equals("C"))
				{
					bwin++;
					alose++;
					bwinnumber.add("C");
					countb[1]++;
				}else if(str[i].equals(str[i+1]))
				{
					adogfall++;
					bdogfall++;
				}
			}
		}
		System.out.print(awin+" "+adogfall+" "+alose);
		System.out.println();
		System.out.print(bwin+" "+bdogfall+" "+blose);
		System.out.println();
		if(counta[0]>=counta[1]&&counta[0]>=counta[2])
		{
			System.out.print("B"+" ");
		}else if(counta[1]>counta[0]&&counta[1]>=counta[2])
		{
			System.out.print("C"+" ");
		}else
		{
			System.out.print("J"+" ");
		}
		
		if(countb[0]>=countb[1]&&countb[0]>=countb[2])
		{
			System.out.print("B");
		}else if(countb[1]>countb[0]&&countb[1]>countb[2])
		{
			System.out.print("C");
		}else
		{
			System.out.print("J");
		}
	}
}
