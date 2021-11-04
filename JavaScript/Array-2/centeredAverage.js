
// return the 'centered' average of an array of ints
// which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array
// if there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value
// use int division to produce the final average
// you may assume that the array is length 3 or more
const centeredAverage = (nums) => {
	let min = nums[0];
	let max = 0;
	let total = 0;

	for (let i = 0; i < nums.length; i++) {
		if (min > nums[i]) {
			min = nums[i];
		}

		if (max < nums[i]) {
			max = nums[i];
		}

		total = total + nums[i];
	}

	return Math.floor((total - min - max) / (nums.length - 2));
};

console.log(centeredAverage([1, 2, 3, 4, 100]));
console.log(centeredAverage([1, 1, 5, 5, 10, 8, 7]));
console.log(centeredAverage([-10, -4, -2, -4, -2, 0]));
