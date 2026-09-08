class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num=0; num<nums.length; num++){
            if(even(nums[num])){
                count++;
            }
        }
        return count;
    }
    boolean even(int num){
        int mark=0;
        while(num>0){
            mark++;
            num=num/10;
        }
        if(mark%2==0){
            return true;
        }
        return false;
    }
}