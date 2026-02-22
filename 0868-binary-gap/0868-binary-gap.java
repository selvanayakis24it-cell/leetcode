class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        
        int prev = -1;
        int maxGap = 0;
        
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (prev != -1) {
                    maxGap = Math.max(maxGap, i - prev);
                }
                prev = i;
            }
        }
        
        return maxGap;
    }
}