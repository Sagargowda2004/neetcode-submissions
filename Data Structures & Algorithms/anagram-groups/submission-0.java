class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char []CharArray=s.toCharArray();
            Arrays.sort(CharArray);
            String sorts=new String(CharArray);
            map.putIfAbsent(sorts,new ArrayList<>());
            map.get(sorts).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}
