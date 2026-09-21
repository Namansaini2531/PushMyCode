class Solution {
    public int findMaximumPairs(String s) {
        // write your code here 
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'x' && s.charAt(i+1) == 'y') count++;
            }
            return count;
        }
        return count;
    }
}
