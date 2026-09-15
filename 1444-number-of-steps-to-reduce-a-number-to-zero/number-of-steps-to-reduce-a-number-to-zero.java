class Solution {
            public int count=0;
    public int numberOfSteps(int n) {
            if(n==0){
            return count;
            }
            if(n%2==0){
            count++;
            n=n/2;
            }
            else{
            count++;
            n=n-1;
            }
            return numberOfSteps(n);
    }
}