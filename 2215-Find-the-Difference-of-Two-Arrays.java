class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        Set<Integer> uni1=new HashSet<>(set1);
        uni1.removeAll(set2);
        Set<Integer> uni2=new HashSet<>(set2);
        uni2.removeAll(set1);

        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>(uni1));
        res.add(new ArrayList<>(uni2));
        return res;
    }
}