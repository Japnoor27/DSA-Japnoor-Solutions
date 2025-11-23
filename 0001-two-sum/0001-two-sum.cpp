class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
vector <int> store;
  for(int i=0;i<nums.size();i++){
    for(int j=i+1;j<nums.size();j++){
      if(nums[i]+nums[j]==target){
     store.push_back(i);
     store.push_back(j);
          return store;
      }
      }
    }

return store;
    }
};