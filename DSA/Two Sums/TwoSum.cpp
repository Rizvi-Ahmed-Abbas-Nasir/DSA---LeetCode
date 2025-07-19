#include<stdio.h>
#include<vector>
#include<iostream>
using namespace std;

vector<int> TwoSum(vector<int> num, int target){
    //  for (int i = 0; i < num.size(); i++) {
    //     // Printing the element at
    //     // index 'i' of vector
    //     cout << num[i];
    // }

    vector<int> ret;
    int size = num.size();
    for(int i = 0; i < size -1; i++){
        for(int j = i+1; j < size; j++){
            if(num[i] + num[j] == target){
                ret.push_back(i);
                ret.push_back(j);
                return ret;

            }
        }
    }

}
int main(){
    vector<int> num{2,7,11,15}; 
    int target = 9;

    vector<int> numRet = TwoSum(num, target);
    for(int i = 0; i <  numRet.size(); i++){
        cout << numRet[i];
    }


return 0;
}