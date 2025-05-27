class Solution {
    public int nextGreaterElement(int n) {
         char[] digits = Integer.toString(n).toCharArray();
        
        int i = digits.length - 2;
        
        // Step 1: Find the first decreasing digit from right
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        // If no such digit found, no larger number can be formed
        if (i < 0) return -1;
        
        // Step 2: Find the smallest digit greater than digits[i] from the right
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: Swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        
        // Step 4: Reverse the part after i
        reverse(digits, i + 1, digits.length - 1);
        
        // Step 5: Convert to integer and check range
        long result = Long.parseLong(new String(digits));
        return (result <= Integer.MAX_VALUE) ? (int) result : -1;
    }
    
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}