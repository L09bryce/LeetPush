class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if(index == -1){
            return word;
        }
        String str = word.substring(0, index + 1);
        String str1 = word.substring(index + 1);
        String str3 = new StringBuilder(str).reverse().toString();
        //String str4 = str3.toString();
        return str3 + str1;


    }
}