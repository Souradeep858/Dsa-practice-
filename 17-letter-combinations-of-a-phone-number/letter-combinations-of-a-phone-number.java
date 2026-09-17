class Solution {
    public List<String> letterCombinations(String up) {
        List<String> ans= new ArrayList<>();
        pad("",up,ans);
        return ans;
    }
    public void pad(String p,String up,List<String>ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        int digits=up.charAt(0)-'0';
        int start,end;
        if(digits==7){
            start=15;
            end=19;
        }
        else if(digits==8){
            start=19;
            end=22;
        }
        else if(digits==9){
            start=22;
            end=26;
        }
        else{
            start=(digits-2)*3;
            end=(digits-1)*3;
        }
        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1),ans);
        }
    }
}