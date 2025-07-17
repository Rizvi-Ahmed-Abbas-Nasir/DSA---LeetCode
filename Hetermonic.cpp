#include <bits/stdc++.h>
using namespace std;

int main() {
    int x;
    cout<<"enter a number ";
    cin>>x;
    string ans="NO";
    for(int i =1;i<=x/2;i++){
        if(i*(i+1)==x){
            ans="YES";
        }
    }
    cout<<ans;

    return 0;
}