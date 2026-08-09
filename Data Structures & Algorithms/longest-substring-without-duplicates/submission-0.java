class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start =0;
        int maxlength =0;
        for(int end =0; end< s.length();end++){
            char current = s.charAt(end);
            if(map.containsKey(current)){
                start = Math.max(start,map.get(current)+1);
            }
            map.put(current,end);
            maxlength = Math.max(maxlength,end-start+1);
        }
        return maxlength;
        
    }
}
