class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> stack=new Stack<>();
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=nums2.length-1;i>=0;i--){
        int ele=nums2[i];
        while(!stack.isEmpty() && stack.peek()<=ele){
            stack.pop();
        }
        if(stack.isEmpty()){
            map.put(ele,-1);
        }else{
            map.put(ele,stack.peek());
        }
       stack.push(ele);
       }
       int ans[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        ans[i]=map.get(nums1[i]);
       }
       return ans;
    }
}