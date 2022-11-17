//package Assignment.Assignment1;
//You will be given a number N. You have to code a hollow diamond looking pattern.
//
//        The output for N=5 is given in the following image.
//
//
//
//public class Patteren_Majic {
//}
//
//
//#include<iostream>
//using namespace std;
//        int main() {
//        int n;cin>>n;
//        n = 2*n-1;
//        string s[n];
//        for(int i=0;i<n/2+1;i++){
//        string s1 = "";
//        for(int j=0;j<n;j++){
//        if(i==0 || j<n/2+1-i){
//        cout<<"*";
//        s1 += "*";
//        }
//        else if(j>=n/2+1-i && j<n/2+i){
//        cout<<" ";
//        s1 += " ";
//        }
//        else{
//        cout<<"*";
//        s1 += "*";
//        }
//        }
//        s[i] = s1;
//        cout<<"\n";
//        }
//        for(int i=n/2-1;i>=0;i--){
//        cout<<s[i]<<"\n";
//        }
//        }