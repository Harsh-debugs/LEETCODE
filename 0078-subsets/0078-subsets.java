class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return result;
    }
    public void backtrack(int[] nums,int index, List<Integer> Current){
        result.add(new ArrayList<>(Current));
        for(int i=index;i<nums.length;i++){
            Current.add(nums[i]);
            backtrack(nums,i+1,Current);
            Current.remove(Current.size()-1);
        }
    }
}