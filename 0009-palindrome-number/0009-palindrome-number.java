class Solution {
    public boolean isPalindrome(int n) {
        int res=0, original=n;

        while(n>0){
           int digit = n%10;  
           n=n/10;
           res=(res*10)+digit;
        }
        return res == original;
    }
    
}