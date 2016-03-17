import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String incom=sc.nextLine();
		String output=sc.nextLine();
		char []in=incom.toCharArray();
		char []out=output.toCharArray();
		List<Character> odd=new ArrayList<Character>();
		List<Character> now=new ArrayList<Character>();
		 
		for(int i=0;i<in.length;i++)
		{
			odd.add(in[i]);
		}
		for(int i=0;i<out.length;i++)
		{
			now.add(out[i]);
		}
		for(int i=0;i<odd.size();i++)
		{
			if(odd.get(i)=='_')
			{
				odd.remove(i);
			}
		}
		for(int i=0;i<now.size();i++)
		{
			if(now.get(i)=='_')
			{
				now.remove(i);
			}
		}
		now.add(' ');
		odd.add(' ');
		int count=0;
		List<Character> str=new ArrayList<Character>();
		List<Character> del=new ArrayList<Character>();
		while(now.size()>0)
		{
			while(odd.size()>0)
			{
				if(now.get(0)!=odd.get(0))
				{
					System.out.print(odd.get(0));
					odd.remove(0);
				}else if(now.get(0)==odd.get(0))
				{
					odd.remove(0);
					now.remove(0);
				}
			}
		}
		
		
	}
}
