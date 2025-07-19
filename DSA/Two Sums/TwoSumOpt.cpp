#include<stdio.h>
#include<iostream>
#include<vector>
#include <unordered_map>
using namespace std;



vector<int> TwoSumOptimized(vector<int>num, int target){

    vector<int> ret;
    int size = num.size();
    int diff;
    unordered_map<int, int> m;
    for(int i = 0; i < size; i++){
        diff = target - num[i];
        if(m.find(diff) != m.end() && m.find(diff)-> second != i){
            ret.push_back(i);
            ret.push_back(m.find(diff)->second);
            return ret;
        }
        m[num[i]] = i;

    }
    return ret;
    

}

int main(){
    vector<int> num{2,7,11,15}; 
    int target = 9;

    vector<int> numRet = TwoSumOptimized(num, target);
    for(int i = 0; i <  numRet.size(); i++){
        cout << numRet[i];
    }


    return 0;
}