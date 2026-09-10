class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            String str = "";
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                str = str + ch;
                if(p(str)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean p(String x){
        int i = 0;
        int j = x.length() - 1;

        while(i <= j){
            if(x.charAt(i) != x.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}