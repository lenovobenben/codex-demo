package main

import "fmt"

// twoSum returns the indices of the two numbers such that they add up to target.
// If no solution exists, it returns nil.
func twoSum(nums []int, target int) []int {
	seen := make(map[int]int)

	for i, n := range nums {
		if j, ok := seen[target-n]; ok {
			return []int{j, i}
		}
		seen[n] = i
	}

	return nil
}

func main() {
	nums := []int{2, 7, 11, 15}
	target := 9

	res := twoSum(nums, target)
	if res == nil {
		fmt.Printf("nums=%v target=%d => no solution\n", nums, target)
		return
	}

	fmt.Printf("nums=%v target=%d => indices=%v values=[%d,%d]\n",
		nums, target, res, nums[res[0]], nums[res[1]])
}
