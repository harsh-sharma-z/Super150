//package Assignment.Assignment1;
//Take N as input. For a value of N=7, we wish to draw the following pattern :
//
//        1
//        2 1   1 2
//        3 2 1       1 2 3
//        4 3 2 1           1 2 3 4
//        3 2 1       1 2 3
//        2 1   1 2
//        1
//
//
//
//
//
//public class Double_Sided_arrow {
//}
//
//
//#include<bits/stdc++.h>
//
//        using namespace std;
//
//        int main() {
//
//        int n;cin>>n;
//        int h = n;
//        int l =1;
//        vector<string>v;
//        for(int i = 0;i<(n+1)/2;++i)
//        {
//        string s="";
//        for(int j =0;j<h-1;++j)
//        cout<<"  ",s+="  ";
//        string k ="";
//        for(int j=i+1;j>0;--j)
//        {
//        cout<<j<<" ";
//        s = s+to_string(j)+" ";
//        k = to_string(j)+" "+k;
//        }
//        if(i==0)
//        {
//        cout<<"\n";
//        h-=2;
//        v.push_back(s);
//        continue;
//        }
//        for(int j= 0;j<l;++j)
//        cout<<"  ",s+="  ";
//        s+=k;
//        cout<<k<<"\n";
//        v.push_back(s);
//        h-=2;
//        l+=2;
//
//        }
//        for(int i = v.size()-2;i>=0;--i)
//        cout<<v[i]<<"\n";
//
//        return 0;
//        }
