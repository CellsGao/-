import java.util.*;  
  //该方法使用哈希表建立映射，输出时取出，比switch没有简单多少
  //该答案解决Int，double类型限制的方法是输入为字符串利用for循环与.charAt（）方法变为字符，并转换为数字，在计算总和（代码11-15行）
  //之前不知道如何将字符变量c变为数字，只了解强制类型转换int n=(int)(c); 但是该方法会输出c变量储存字符的ascii码，今天学到可以用Integer类
  //的parseInt（String s）方法，该方法可将字符串作为Int值进行解析，代码内c.toString()是将变为char类型的字母变为String类型，使其转换。
public class Main {  
  
    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);  
        String string =scanner.next();                       //读取输入值  
          
        int count=0,flag;  
        for (int k=0;k<string.length();k++) {                //计算所有数之和  
            Character c=string.charAt(k);  
            int num=Integer.parseInt(c.toString());  
            count+=num;           
                }  
        HashMap<Integer, String> tableHashMap = new HashMap<Integer,String>();        //定义一个映射表  
        tableHashMap.put(1, "yi");  
        tableHashMap.put(2, "er");  
        tableHashMap.put(3, "san");  
        tableHashMap.put(4, "si");  
        tableHashMap.put(5, "wu");  
        tableHashMap.put(6, "liu");  
        tableHashMap.put(7, "qi");  
        tableHashMap.put(8, "ba");  
        tableHashMap.put(9, "jiu");  
        tableHashMap.put(0, "ling");  
        String countString=((Integer) count).toString();  
        for(int j=0;j<countString.length()-1;j++){  
            Character c1=countString.charAt(j);  
            int num1=Integer.parseInt(c1.toString());  
            System.out.print(tableHashMap.get(num1)+" ");  
        }  
        System.out.println(tableHashMap.get(Integer.parseInt(((Character)countString.charAt(countString.length()-1)).toString())));  
    }  
}  
