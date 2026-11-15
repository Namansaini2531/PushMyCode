class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;

        for(int i = 0; i < Math.min(g.length, s.length); i++){
            if(g[i] == s[i]) count++;
        }
        return count;
    }
}