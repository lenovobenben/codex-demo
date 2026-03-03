package main

import "testing"

func TestTwoSum(t *testing.T) {
	tests := []struct {
		name   string
		nums   []int
		target int
		want   []int
	}{
		{name: "basic", nums: []int{2, 7, 11, 15}, target: 9, want: []int{0, 1}},
		{name: "with negative", nums: []int{-3, 4, 3, 90}, target: 0, want: []int{0, 2}},
		{name: "no solution", nums: []int{1, 2, 3}, target: 7, want: nil},
	}

	for _, tc := range tests {
		t.Run(tc.name, func(t *testing.T) {
			got := twoSum(tc.nums, tc.target)

			if tc.want == nil {
				if got != nil {
					t.Fatalf("expected nil, got %v", got)
				}
				return
			}

			if got == nil {
				t.Fatalf("expected indices %v, got nil", tc.want)
			}

			if len(got) != 2 || got[0] != tc.want[0] || got[1] != tc.want[1] {
				t.Fatalf("expected %v, got %v", tc.want, got)
			}
		})
	}
}
