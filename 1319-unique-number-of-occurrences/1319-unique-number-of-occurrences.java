class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:arr){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        Set<Integer>set=new HashSet<>(mp.values());

        return set.size()==mp.size();
        
    }
}