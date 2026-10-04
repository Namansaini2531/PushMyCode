class Solution {
    public int minRotations(String s) {
        int curr = 0;
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            int next = s.charAt(i) - '0';

            int dist = Math.abs(curr - next);

            ans += Math.min(dist, 10 - dist);

            curr = next;
        }
        return ans;
    }
}