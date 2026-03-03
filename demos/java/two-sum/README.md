# Java Demo: Two Sum

## 功能
Java 版本经典算法题「两数之和（Two Sum）」，使用哈希表在 O(n) 时间内返回两个下标。

## 环境
- JDK 17+（本环境验证使用 OpenJDK 25）

## 运行
```bash
cd demos/java/two-sum
javac TwoSumDemo.java
java TwoSumDemo
```

## 预期输出
```text
nums=[2, 7, 11, 15] target=9 => indices=[0, 1] values=[2,7]
```

## 说明
- 核心方法：`twoSum(int[] nums, int target)`
- 算法思想：遍历数组 + 哈希表记录历史值
- 时间复杂度：O(n)
- 空间复杂度：O(n)
