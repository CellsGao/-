import java.text.DecimalFormat;
import java.util.Scanner;
 //有一个用例运行超市，原因不明
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int a1=0;
        int a2=0;
        int a3=0;
        double a4=0;
        int a5=0;
        boolean b=true;
        double temp=0.0;
        int counter=0;
        boolean c1,c2,c3,c4,c5;
        c1=c2=c3=c4=c5=true;
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            switch (a[i]%5) {
            case 0:
                if (a[i]%2==0) {                   
                    a1+=a[i];
                    c1=false;
                }
                break;
            case 1:
                if (b) {
                    a2+=a[i];
                }
                if(!b){
                    a2-=a[i];
                }
                b=!b;
                c2=false;
                break;
            case 2:            
                a3++;
                c3=false;
                break;
            case 3:
                temp+=a[i];
                counter++;
                a4=temp/counter;
                c4=false;
                break;
            case 4:
                if (a[i]>a5) {                  
                    a5=a[i];
                }
                c5=false;
                break;
            }
        }
        sc.close();
        DecimalFormat df = new DecimalFormat( "0.0");
        if (c1) {
            System.out.print("N ");
        }else {
            System.out.print(a1+" ");
        }
        if (c2) {
            System.out.print("N ");
        }else {
            System.out.print(a2+" ");
        }
        if (c3) {
            System.out.print("N ");
        }else {
            System.out.print(a3+" ");
        }
        if (c4) {
            System.out.print("N ");
        }else {
            System.out.print(df.format(a4)+" ");
        }
        if (c5) {
            System.out.print("N");
        }else {
            System.out.print(a5);
        }      
    }
 
}
