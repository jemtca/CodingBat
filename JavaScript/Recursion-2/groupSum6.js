
// given an array of ints, is it possible to choose a group of some of the ints,
// beginning at the start index, such that the group sums to the given target?
// however, with the additional constraint that all 6's must be chosen
const groupSum6 = (start, nums, target) => {
	if (start >= nums.length) {
		return target === 0;
	} else {
		if (nums[start] === 6) {
			return groupSum6(start + 1, nums, target - nums[start]);
		} else {
			return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
		}
	}
};


console.log(groupSum6(0, [5, 6, 2], 8));
console.log(groupSum6(0, [5, 6, 2], 9));
console.log(groupSum6(0, [5, 6, 2], 7));
