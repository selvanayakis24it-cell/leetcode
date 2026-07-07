class Solution {
    public long sumAndMultiply(int n) {
        // Handle the edge case where n is 0
        if (n == 0) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        long sum = 0;
        String s = Integer.toString(n);

        // Single pass: build the non-zero string and calculate the sum
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '0') {
                sb.append(ch);
                sum += (ch - '0');
            }
        }

        // If all digits were zero (e.g., n = 000), return 0
        if (sb.length() == 0) {
            return 0;
        }

        // Parse the concatenated non-zero string into a long to avoid overflow
        long x = Long.parseLong(sb.toString());

        return x * sum;
    }
}