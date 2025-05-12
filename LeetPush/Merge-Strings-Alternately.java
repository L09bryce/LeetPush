class Solution {
    public String mergeAlternately(String str, String str1) {
        StringBuilder sb = new StringBuilder();
		int i = 0; int j = 0;
		while(i < str.length() && j < str1.length()) {
			sb.append(str.charAt(i++));
			sb.append(str1.charAt(j++));
			
		}
		
		while(i < str.length()) {
			sb.append(str.charAt(i++));
		}
		while(j < str1.length()) {
			sb.append(str1.charAt(j++));
		}
        return sb.toString();
    }
}