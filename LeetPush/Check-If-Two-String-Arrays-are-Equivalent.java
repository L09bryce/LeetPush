class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String words = String.join("", word1);
        String words1 = String.join("", word2);

        if(words.equals(words1)){
            return true;
        }
        else{
            return false;
        }
        
    }
}