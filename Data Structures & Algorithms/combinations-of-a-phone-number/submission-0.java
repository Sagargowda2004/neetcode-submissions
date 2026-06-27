class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0)return ans;
        String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(0,digits,new StringBuilder(),ans,map);
        return ans;
    }

    void solve(int index,String digits,StringBuilder sb,List<String> ans,String map[]){
        if(index==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letters=map[digits.charAt(index)-'0'];

        for(char c:letters.toCharArray()){
            sb.append(c);
            solve(index+1,digits,sb,ans,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
