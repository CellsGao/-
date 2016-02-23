import java.util.*;
//太简单，没啥好说的
public class Main { 
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int hundred=0;
		int digt=0;
		int single=0;
		hundred=num/100;
		single=num%10;
		digt=(num%100-single)/10;
		for(int i=0;i<hundred;i++)
		{
			System.out.print('B');
		}
		for(int i=0;i<digt;i++)
		{
			System.out.print('S');
		}
		for(int i=1;i<=single;i++)
		{
			System.out.print(i);
		}
	}
}
