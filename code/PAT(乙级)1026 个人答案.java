import java.util.Scanner;
public class  Main{
 
    public static void main(String[] arg){
       Scanner sc=new Scanner(System.in);
      
       int n=sc.nextInt();
       String[] str=new String[2*n];
       int base=20140906;
       String max,min;
       int ma=0,mi=2000000;
       int count=0;
       for(int i=0;i<n;i++){
           str[2*i]=sc.next();
           str[2*i+1]=sc.next().replace("/", "");
       }
       
       max=" ";min=" ";
       for(int i=0;i<n;i++){
           
           int age=Integer.parseInt(str[2*i+1]);
           if(age-base>0)continue;
           if(base-age>2000000)continue;
           int temp=base-age;
           if(temp>ma){
               ma=temp;
               max=str[2*i];      
           }
           if(temp<mi){
               mi=temp;
               min=str[2*i];
           }
           count++;
       }
        
       System.out.println(count+" "+max+" "+min);
    }
}
