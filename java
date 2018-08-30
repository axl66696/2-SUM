public int[] twoSum(int[] nums,int target){
  if(nums == NULL || nums.length < 2){
    return new int[]{0,0};
  }
  HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
   
  for(int i = 0;i<nums.length;i++){
    complement = target - nums[i];
    if(hash.containsKey(comlement)){
      return new int[]{hash.get(complement),i};
    }
    else
      hash.put(nums[i],i);
  }
  return new int[]{0,0};
}
