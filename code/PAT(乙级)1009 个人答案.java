给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
输入格式：测试输入包含一个测试用例，在一行内给出总长度不超过80的字符串。字符串由若干单词和若干空格组成，
其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用1个空格分开，输入保证句子末尾没有多余的空格。
输出格式：每个测试用例的输出占一行，输出倒序后的句子。
输入样例：
Hello World Here I Come
输出样例：
Come I Here World Hello

import java.util.*;
//主要思路是以空格为标识，使用str.substring(begin,end)方法截取字符串输入数组，在倒序输出数组。由于输入最后无空格，于是人为添加一个空格。
public class Main { 
	
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String st=in.nextLine();
		String str=st+" ";
		int begin=0;
		int end=0;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		String []group=new String[count];
		int n=0;
		while(n<count)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==' ')
				{
					end=j;
					group[n]=str.substring(begin,end);
					if(begin+1<str.length())
					{
						begin=j+1;
					}
					n++;
				}
				
			}
		}
		for(int i=count-1;i>0;i--)
		{
			System.out.print(group[i]+" ");
		}
		System.out.print(group[0]);
		
	}
}
