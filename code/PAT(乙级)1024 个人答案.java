import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char cha=str.charAt(0);
		char signal=' ';
		int end = 0;
		String str1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='E')
			{
				signal=str.charAt(i+1);
				end=i;
			}
		}
		int Pow=0;
		str1=str.substring(end+2);
		Pow=Integer.parseInt(str1);
		String str2=str.substring(1,end);
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<str2.length();i++)
		{
			list.add(str2.charAt(i));
		}
		int count=0;
		if(signal=='-')
		{
			count=Pow;
			list.remove(1);
		}
		while(count>0)
		{
			if(signal=='-')
			{
				list.add(0,'0');
				count--;
			}
			
		}
		if(signal=='+')
		{
			if(Pow>list.size()-2)
			{
				list.remove(1);
				count=Pow-(list.size()-1);
				while(count>0)
				{
					list.add('0');
					count--;
				}
			}else if(Pow<list.size()-2)
			{
				list.remove(1);
				list.add(Pow+1,'.');
			}
		}
		if(signal=='-')
		{
			list.add(1,'.');
		}
		if(cha=='+')
		{
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i));
			}
		}else if(cha=='-')
		{
			System.out.print("-");
			for(int i=0;i<list.size();i++)
			{
				
				System.out.print(list.get(i));
			}
		}
		
		in.close();
	}
}
