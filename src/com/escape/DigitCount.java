package com.escape;

public class DigitCount {

    //Input: nums = [13,25,83,77]
    //Output: [1,3,2,5,8,3,7,7]

    public int[] separateDigits(int[] nums) {
        int count = 0;
        for(int i : nums){
            int c = 0;
            while(i > 0){
                c++;
                i = i / 10;
            }
            count += c;
        }

        int[] arr = new int[count];

        for(int i = nums.length - 1; i >= 0; i--){
            while(nums[i] > 0){

                int rem = nums[i] % 10;

                nums[i] = nums[i] / 10;
                arr[count - 1] = rem;
                count--;
            }
        }

        return arr;
    }

    // LC 448
        public List<Integer> findDisappearedNumbers(int[] nums) {
        int max = 0;
        int[] freq = new int[nums.length + 1];

        for(int i : nums){
            if( i > max) max = i;
            freq[i]++;
        }
        List<Integer> ll = new ArrayList();
        for(int i = 1; i <= nums.length; i++){
            if(freq[i] == 0){
                ll.add(i);
            }
        }

        return ll;
    }
}
