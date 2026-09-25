class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int max = nums[0];
        int min = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }

            if(nums[i] < min) {
                min = nums[i];
            }
        }

        int offset = -min;
        int[] count = new int[max - min + 1];

        for(int i = 0; i < nums.length; i++) {
            count[nums[i] + offset] += 1;
        }

        int[] y = new int[count.length];

        for(int i = 0; i < count.length; i++) {
            y[i] = i - offset;
        }

        int[] freq = new int[count.length];

        for(int i = 0; i < count.length; i++) {
            freq[i] = count[i];
        }

        for(int i = 0; i < count.length; i++) {
            for(int j = i + 1; j < count.length; j++) {

                if(freq[i] < freq[j]) {

                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    int temp1 = y[i];
                    y[i] = y[j];
                    y[j] = temp1;
                }
            }
        }

        int[] op = new int[k];
        int index = 0;

        for(int i = 0; i < y.length && index < k; i++) {

            if(freq[i] > 0) {
                op[index] = y[i];
                index++;
            }
        }

        return op;
    }
}