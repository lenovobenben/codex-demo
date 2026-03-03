import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Java 版两数之和（Two Sum）演示。
 *
 * <p>题目：给定整数数组 nums 和目标值 target，
 * 找到两个下标 i、j，使得 nums[i] + nums[j] == target。</p>
 *
 * <p>实现思路（哈希表）：
 * 1) 使用 map 记录“数字 -> 下标”。
 * 2) 遍历当前数字 n 时，计算补数 complement = target - n。
 * 3) 若 complement 已在 map 中，说明找到答案，立即返回。
 * 4) 否则把当前数字写入 map，继续遍历。
 *
 * <p>复杂度：时间 O(n)，空间 O(n)。</p>
 */
public class TwoSumDemo {

    /**
     * 返回满足条件的两个下标。
     *
     * @param nums   输入数组
     * @param target 目标值
     * @return 长度为 2 的下标数组；若无解返回 null
     */
    public static int[] twoSum(int[] nums, int target) {
        // key: 数字值，value: 该数字首次出现的下标
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            // 如果补数已出现，直接返回补数下标 + 当前下标
            if (seen.containsKey(complement)) {
                return new int[] {seen.get(complement), i};
            }

            // 记录当前数字及其下标
            seen.put(current, i);
        }

        // 题目通常假定一定有解；这里为 demo 健壮性保留无解分支
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result == null) {
            System.out.printf("nums=%s target=%d => no solution%n", Arrays.toString(nums), target);
            return;
        }

        System.out.printf(
                "nums=%s target=%d => indices=%s values=[%d,%d]%n",
                Arrays.toString(nums),
                target,
                Arrays.toString(result),
                nums[result[0]],
                nums[result[1]]
        );
    }
}
