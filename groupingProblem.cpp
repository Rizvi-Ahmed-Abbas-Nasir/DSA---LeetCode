#include <bits/stdc++.h>
using namespace std;

void f(int n,vector<int>&arr){
    vector<vector<int>>ans;
    for(int i=0;i<n;i++){
        int sum=0;
        vector<int>v;
        for(int j=i;j<n;j++){
            if(sum+arr[j]<=10){
                sum+=arr[j];
                v.push_back(arr[j]);
            }
            else{
                break;
            }
        }
        if (!v.empty()) {
            ans.push_back(v);
        }
    }
    int x=ans.size();
    int y=ans[0].size();
    for(int i=0;i<ans.size();i++){
        for(int j=0;j<ans[i].size();j++){
            cout<<ans[i][j]<<" ";
        }
        cout<<endl;
    }
}
int main() {
    
    int n;
    cout<<"enter the size of array : ";
    cin>>n;
    
    vector<int>arr;
    cout<<"enter the array elements : ";
    for(int i=0;i<n;i++){
        int x;
        cin>>x;
        arr.push_back(x);
    }
    
    f(n,arr);

    return 0;
}