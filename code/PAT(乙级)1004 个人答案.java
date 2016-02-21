import java.util.*;
//简单题，没什么好说的，由于数据结构只会数组，做起来麻烦了些，会其他可建立映射关系的数据结构会更简单 
public class Main { 
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		String [][]std=new String[num][3];
		int []score=new int[num];
		//输入学生信息
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<3;j++)
			{
				std[i][j]=in.next();
			}
		}
		//学生得分转换为int类型输入score数组
		for(int i=0;i<num;i++)
		{
			score[i]=Integer.parseInt(std[i][2]);
		}
		Arrays.sort(score);
		for(int i=0;i<num;i++)
		{
			if(Integer.parseInt(std[i][2])==score[num-1])
			{
				System.out.println(std[i][0]+" "+std[i][1]);
			}
		}
		for(int i=0;i<num;i++)
		{
			if(Integer.parseInt(std[i][2])==score[0])
			{
				System.out.println(std[i][0]+" "+std[i][1]);
			}
		}
	}
}
