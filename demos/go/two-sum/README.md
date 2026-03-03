# Go Demo: Two Sum

## 功能
使用哈希表实现经典算法题「两数之和（Two Sum）」，返回满足 `nums[i] + nums[j] == target` 的两个下标。

## 环境
- Go 1.25+（本仓库示例使用 Go 1.25.1）

## 运行
```bash
cd demos/go/two-sum
go run .
go test ./...
```

## 预期输出
示例输入：`nums=[2,7,11,15], target=9`

输出类似：
```text
nums=[2 7 11 15] target=9 => indices=[0 1] values=[2,7]
```

## 算法说明
- 使用 `map[value]index` 记录已遍历元素。
- 遍历到 `n` 时，先检查 `target-n` 是否已出现。
- 若出现则立即返回结果，下标查找为 O(1) 平均复杂度。
- 总体时间复杂度 O(n)，空间复杂度 O(n)。
