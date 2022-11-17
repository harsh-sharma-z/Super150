//package Assignment.Assignment1;
//
//
//
//Take N as input. For a value of N=5, we wish to draw the following pattern :
//
//        5                   5
//        5 4               4 5
//        5 4 3           3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2 1 0 1 2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3           3 4 5
//        5 4               4 5
//        5                   5
//        Input Format
//        Take N as input.
//
//
//
//
//
//public class Patter_Inverted_Hourglass {
//}
//
//
//
//#include<bits/stdc++.h>
//        using namespace std;
//
//        #define ll long long
//
//        int main(){
//
//        ios_base::sync_with_stdio(0);
//        cin.tie(0);
//        cout.tie(0);
//
//        int n;cin>>n;
//        int h =2*n-1;
//        vector<string>v;
//        for(int i = 0;i<n;++i)
//        {
//        string k="";
//        int o=n;
//        string s="";
//        for(int j=i+1;j>0;--j)
//        {
//        cout<<o<<" ";
//        s+=to_string(o)+" ";
//        k = to_string(o)+" "+k;
//        o--;
//        }
//        for(int j=0;j<h;++j)
//        cout<<"  ",s+="  ";
//        h-=2;
//        cout<<k<<"\n";
//        s+=k;
//        v.push_back(s);
//        }
//        for(int i =n;i>=0;--i)
//        cout<<i<<" ";
//        for(int i = 1;i<=n;++i)
//        cout<<i<<" ";
//        cout<<"\n";
//
//        for(int i = v.size()-1;i>=0;--i)
//        {
//        cout<<v[i]<<"\n";
//        }
//
//        return 0;
//        }