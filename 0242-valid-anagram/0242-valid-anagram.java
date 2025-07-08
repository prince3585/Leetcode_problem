class Solution {
    public boolean isAnagram(String s, String t) {
     
        int m = s.length();
        int n = t.length();

        if (m != n) {
            return false;
        }

        int[] freq = new int[26]; 

        for (int i = 0; i < m; i++) {
            freq[s.charAt(i) - 'a']++; 
            freq[t.charAt(i) - 'a']--;  
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false; 
            }
        }

        return true; 
    

    }
}
