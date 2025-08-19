class Solution {
    public int maximum69Number (int num) {
        String strb=Integer.toString(num);
         StringBuffer str=new StringBuffer(strb);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='6'){
                str.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(String.valueOf(str));
        
    }
}