import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int p=in.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(in.nextInt());
		}
		int [] a=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			a[i]=list.get(i);
		}
		Arrays.sort(a);
		int max=0;
		 for(int i=0;i<n;i++)
		 {
		             
		            for(int j=i+max;j<n;j++)
		            {
		              
		        	    if(a[i]*p<a[j])
		        	    {
		        		    break;
		        	    }
		                  max++;
		              }
		  }
		 System.out.print(max);
	}
}
