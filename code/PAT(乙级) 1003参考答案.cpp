#include <iostream>  
#include <string>  
using namespace std;  
 //此题不能单纯按逻辑匹配字符串，还要考虑三个条件之间的关系找出正确字符串中祖父的数量关系
 //1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
 //2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 //3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
 //分析得字符串中一定有一个PT且位置固定，通过对样例的观察，PT中间必有一个A，则c，b和a可以等于0
 //通过对条件的分析，最后可以得到XPYTZ，其中X，Y,Z都均是A或者空，并且X中A的个数 乘以 Y中A的个数 等于 Z中A的个数，且Y中A的个数>=1。
 //简单的说，P前面A的个数 乘以 PT之间A的个数 等于 T后面A的个数。
bool FindPT(string &str , int &indexP, int &indexT)  
{  
    int numP=0, numT=0;  
    for(int i=0; i<str.size(); ++i)  
    {  
        if(str[i] != 'P' && str[i] != 'A' && str[i] != 'T')  
        {  
            return false;  
        }  
        if(str[i] == 'P')  
        {  
            if(++numP >= 2)  
                return false;  
            indexP = i;  
        }  
        if(str[i] == 'T')  
        {  
            if(++numT >= 2)  
                return false;  
            indexT = i;           
        }  
    }  
    return true;  
}  
  
int main(int argc, char const *argv[])  
{  
    int num;  
    cin>>num;  
    string str;  
    while(num--)  
    {  
        cin>>str;  
        int indexP = 0, indexT = 0;  
        if(!FindPT(str, indexP,indexT))  
            cout<<"NO"<<endl;  
        else if(indexP * (indexT-indexP-1) != str.size()-indexT-1 || indexT == indexP +1)  
            cout<<"NO"<<endl;  
        else  
            cout<<"YES"<<endl;  
    }  
    return 0;  
}  
