class Solution {
    public int countRotations(String s, int k){
        int x = s.length();
        int count = 0;

        for(int i = 0; i < x; i++){
            if(s.charAt(i) == s.charAt((i+1)%x)){
                count++;
            }
        }

        int ans = 0;

        if(k == count){
            ans += x - count;
        }
        if(k == count - 1){
            ans += count;
        }
        return ans;
    }
}