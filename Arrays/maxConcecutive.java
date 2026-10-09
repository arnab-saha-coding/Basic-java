class maxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int beststreak = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
                if (count > beststreak) {
                    beststreak = count;
                }
            } else {
                count = 0;
            }
        }
        return beststreak;
    }
}
