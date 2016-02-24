import java.util.*;
//较简单
public class Main { 
	public static boolean isPrime(int a)
	{
		boolean flag = true;  
		if(a==1)
		{
			return true;
		}else if (a == 2) 
	    { 
	        return false;  
	    } else 
	    {  
	    	for (int i = 2; i <= Math.sqrt(a); i++) 
	    	{  
	    		if (a % i == 0) 
	    		{// 若能被整除，则说明不是素数，返回false 
	    			flag = false;  
	                break;// 跳出循环  
	            }  
	        }  
	    }  
	    return flag;  
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=0;
		int countdouble=0;
		List<Integer> list=new ArrayList<Integer>();
		//存入数组，使用ArrayList，相当于长度可变数组，将为0的元素都删去，剩下就是素数元素。
		for(int i=1;i<=num;i++)
		{
			if(isPrime(i))
			{
				list.add(i);
			}
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==0)
			{
				list.remove(i);
			}
		}
		
		//遍历数组找出符合条件的素数对
		for(int i=2;i<list.size();i++)
		{
			if((list.get(i)-list.get(i-1)==2))
			{
				
				countdouble++;
			}
		}
		System.out.println(countdouble);
	}
}
