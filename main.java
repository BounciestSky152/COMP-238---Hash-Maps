import java.lang.Math;
import java.util.HashMap;


class ContainsNearbyDuplicates {
   public static boolean containesNearbyDuplicate(int[] nums, int k){
         for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
               if(i != j && nums[i] == nums[j] && Math.abs(i-j) <= k){
                  System.out.println(nums[i]);
                  System.out.println(j);
                  return true;
               }
               
            }
         }
         
         return false;
         
      }
   

   public static void main(String[] args) {
      int[] nums = {1, 2, 3};
      
   }
}
