class Solution {
public:
    int countElements(vector<int>& nums) {
        int count = 0;

        for(int i = 0; i < nums.size(); i++){
            bool check = false;

            for(int j = 0; j < nums.size(); j++){
                if(nums[i] > nums[j]){        // smaller mil gaya

                    for(int k = 0; k < nums.size(); k++){
                        if(nums[k] > nums[i]){  // bigger mil gaya
                            check = true;
                            break; // k loop break
                        }
                    }
                }
                if(check) break; // j loop break once confirmed
            }

            if(check) count++; // count add
        }

        return count;
    }
};
