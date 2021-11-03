
// given an array length 1 or more of ints, return the difference between the largest and smallest values in the array
const bigDiff = (nums) => {
	let max = 0;
	let min = nums[0];

	for (let i = 0; i < nums.length; i++) {
		if (max < nums[i]) {
			max = nums[i];
		}

		if (min > nums[i]) {
			min = nums[i];
		}
	}

	return max - min;
};

console.log(bigDiff([10, 3, 5, 6]));
console.log(bigDiff([7, 2, 10, 9]));
console.log(bigDiff([2, 10, 7, 2]));
