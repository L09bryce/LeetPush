class Solution {
    public boolean isPalindrome(String s) {
        String str1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder sb = new StringBuilder(str1);
		StringBuilder reversed = sb.reverse();
		String str2 = reversed.toString();
		if(str1.contentEquals(str2)) {
			return true;
		}
		else {
			return false;
		}
    }
}