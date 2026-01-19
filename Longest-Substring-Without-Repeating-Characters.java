1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        
4        HashSet<Character> set = new HashSet<>();
5        int count = 0;
6        int left = 0;
7
8
9        for(int right =0; right < s.length(); right++){
10                if(!set.contains(s.charAt(right))){
11                    set.add(s.charAt(right));
12                    count = Math.max(count, right - left +1);
13                }else{
14                    while(set.contains(s.charAt(right))){
15                        set.remove(s.charAt(left));
16                        left++;
17                    }
18                    set.add(s.charAt(right));
19                }
20        }
21        return count;
22    }
23}