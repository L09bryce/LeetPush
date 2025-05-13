class Solution {
    public boolean halvesAreAlike(String s) {
       String str = s.toLowerCase(); 
       String div1 = str.substring(0, str.length() / 2);
       String div2 = str.substring(str.length() /2, str.length());
       int count = 0;
       int count1 =0;
       List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
       for(char ch : div1.toCharArray()){
        if(list.contains(ch)){
            count++;
        }
       }
       for(char ch : div2.toCharArray()){
        if(list.contains(ch)){
            count1++;
        }
       }
       return count == count1 ? true : false;
    }
}