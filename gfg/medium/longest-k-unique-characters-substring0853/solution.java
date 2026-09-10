class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int max = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int l = 0;
        int r = 0;
        
        while(r < s.length()){
            char ch = s.charAt(r);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
        while(map.size() > k){
            char chh = s.charAt(l);
            if(map.get(chh) == 1){
                map.remove(chh);
            }
            else{
                map.put(chh, map.get(chh) - 1);
            }
            l++;
        }
        if(map.size() == k){
            max = Math.max(max, r - l + 1);
            
        }
        r++;
        }
        return max == 0 ? -1 : max;
    }
}