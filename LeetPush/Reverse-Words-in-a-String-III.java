class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(String word : words){
            StringBuilder strs = new StringBuilder(word);
            str.append(strs.reverse().append(" "));
        }
        return str.toString().trim();

    }
}