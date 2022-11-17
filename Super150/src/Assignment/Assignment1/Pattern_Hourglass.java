//package Assignment.Assignment1;
//Take N as input. For a value of N=5, we wish to draw the following pattern :
//
//        5 4 3 2 1 0 1 2 3 4 5
//        4 3 2 1 0 1 2 3 4
//        3 2 1 0 1 2 3
//        2 1 0 1 2
//        1 0 1
//        0
//        1 0 1
//        2 1 0 1 2
//        3 2 1 0 1 2 3
//        4 3 2 1 0 1 2 3 4
//        5 4 3 2 1 0 1 2 3 4 5
//public class Pattern_Hourglass {
//}
//
//
//#include<bits/stdc++.h>
//
//        using namespace std;
//
//
//        int main()
//        {
//        int n;cin>>n;
//        int k = n;
//        vector<string>v;
//        for(int i = 0;i<n;++i)
//        {
//        string s="";
//        for(int j=0;j<i;++j)
//        cout<<"  ",s+="  ";
//
//        int o = k;
//        string l="";
//        for(int j =o;j>0;--j)
//        cout<<j<<" ",l=to_string(j)+" "+l,s+=to_string(j)+" ";
//        s+="0 ";
//        cout<<0<<" ";
//        s+=l;
//        cout<<l<<"\n";
//        k--;
//        v.push_back(s);
//        }
//        for(int i = 0;i<n;++i)
//        cout<<"  ";
//        cout<<0<<"\n";
//        for(int i =v.size()-1;i>=0;--i)
//        cout<<v[i]<<"\n";
//        return 0;
//        }
//
