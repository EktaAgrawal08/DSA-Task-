import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int ngr[]=nextgreater(nums2);

      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums2.length;i++){
        map.put(nums2[i],ngr[i]);
      }
      int Ans[]=new int[nums1.length];
      for(int i=0;i<nums1.length;i++){
        Ans[i]=map.get(nums1[i]);
      }
      return Ans;


    }
    public static int[] nextgreater(int[] nums2){
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(nums2[i]);
        }
        return ans;
    }
   
}