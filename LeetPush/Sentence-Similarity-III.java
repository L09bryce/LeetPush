class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String str1 = sentence1.trim();
        String str2 = sentence2.trim();

        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        
        int len = arr1.length;
        int len1 = arr2.length;
        if(sentence1.matches(sentence2)){
            return true;
        }
        else{
        int i =0;

        while(i < len && i < len1 && arr1[i].equals(arr2[i])){
            i++;
        }

        int j =0;
        while(j < len && j < len1 && arr1[len -1 -j].equals(arr2[len1 -1 -j])){
            j++;
        }
        return i + j >= Math.min(len, len1);
        }
        
    }
}