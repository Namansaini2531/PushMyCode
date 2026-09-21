class Solution {
    public int findMaximumPairs(String s) {
        // write your code here 
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)) 
                count++;
                i++; 
            }
        }
        return count;
    }
}
