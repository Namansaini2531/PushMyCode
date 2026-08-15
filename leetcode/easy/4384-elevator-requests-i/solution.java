class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int floor = 0;
        int secs = 0;
        for(int i = 0; i<requests.length; i++){
            secs = secs + Math.abs(requests[i] - floor);
            floor = requests[i];
            
        }
        return secs;
    }
}