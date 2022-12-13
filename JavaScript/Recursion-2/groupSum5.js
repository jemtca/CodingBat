
// given an array of ints, is it possible to choose a group of some of the ints,
// such that the group sums to the given target with these additional constraints:
// all multiples of 5 in the array must be included in the group
// if the value immediately following a multiple of 5 is 1, it must not be chosen
const groupSum5 = (start, nums, target) => {
	if (start >= nums.length) {
		return target === 0;
	} else {
		if (nums[start] % 5 === 0) {
			if (start + 1 < nums.length && nums[start + 1] === 1) {
				return groupSum5(start + 2, nums, target - nums[start]);
			} else {
				return groupSum5(start + 1, nums, target - nums[start]);
			}
		}

		return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
	}
};

console.log(groupSum5(0, [2, 5, 10, 4], 19));
console.log(groupSum5(0, [2, 5, 10, 4], 17));
console.log(groupSum5(0, [2, 5, 10, 4], 12));
