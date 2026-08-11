class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int start =0;
        int maxreplace=0;
        int res =0;
        for(int end =0; end < s.length();end++){
            char current = s.charAt(end); 
            map.put(current, map.getOrDefault(current,0)+1);// counting frequency of each element then finding max
            maxreplace = Math.max(maxreplace,map.get(current));
            
            if((end-start +1 ) - maxreplace > k){
                map.put(s.charAt(start), map.get(s.charAt(start))-1);
                start++; // shrinking the window , start is incremenented
            }
            res = Math.max(res,end-start+1);
        }
        return res;
        
    }
}
