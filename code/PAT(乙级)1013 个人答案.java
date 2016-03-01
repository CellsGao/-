import java.util.*;
 //暴力方法，10000个质数存进数组，寻找位置输出
public class Main {
	public static boolean isPrime(int a)
	{
		boolean flag = true;  
		  
        if (a < 2) 
        {
            return false;  
        } else 
        {  
  
            for (int i = 2; i <= Math.sqrt(a); i++) 
            {  
  
                if (a % i == 0) 
                { 
  
                    flag = false;  
                    break;
                }  
            }  
        }  
        return flag;  
	}
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt();
    	int m=in.nextInt();
    	List<Integer> list=new ArrayList<Integer>();
    	int i=0;
    	while(list.size()<10000)
    	{
    		
    		if(isPrime(i))
    		{
    			list.add(i);
    			i++;
    		}else
    		{
    			i++;
    		}
    	}
    	int count=0;
    	for(int j=n-1;j<m;j++)
    	{
    		
    		System.out.print(list.get(j));
    		count++;
    		if(count%10!=0&&count!=m-n+1)
    		{
    			System.out.print(" ");
    		}else if(count%10==0)
    		{
    			System.out.println();
    		}
    			
    	}
    }
 
}
