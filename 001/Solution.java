import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 1};  

        System.out.println(solution.containsDuplicate(nums));
    }
}