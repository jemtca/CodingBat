
// return the sum of the numbers in the array, returning 0 for an empty array
// except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count
const sum13 = (nums) => {
	let sum = 0;

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] === 13) {
			i++;
			continue;
		}

		sum = sum + nums[i];
	}

	return sum;
};

console.log(sum13([1, 2, 2, 1]));
console.log(sum13([1, 1]));
console.log(sum13([1, 2, 2, 1, 13]));
