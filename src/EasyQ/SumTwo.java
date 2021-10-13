package EasyQ;

import java.util.ArrayList;

public class SumTwo {
    public static void main(String[] args) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
        int [] nums={2,7,11,15};
        ArrayList<Integer> newNum=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]+nums[j]==9){
                    newNum.add(i);
                    newNum.add(j);
                }
            }

        }
        System.out.println(newNum);
    }
}
