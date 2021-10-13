package EasyQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoLinkedList {
    public static void main(String[] args) {
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//        Explanation: Your function should return k = 5,
//        with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//                It does not matter what you leave beyond the
//        returned k (hence they are underscores).
        int [] nums={0,0,1,1,1,2,2,3,3,4};
        int count=0;
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]==nums[j]){
                   count++;

                }if(nums[i]!=nums[j]){
                    list.add(Integer.valueOf(i));
                }
                break;
            }

        }



        System.out.println(list);




    }
}
