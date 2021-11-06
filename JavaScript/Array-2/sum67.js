
// return the sum of the numbers in the array
// except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7)
// return 0 for no numbers
const sum67 = (nums) => {
	let sum = 0;
	let found = false;

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] === 6) {
			found = true;
		}

		if (nums[i] !== 6 && !found) {
			sum = sum + nums[i];
		}

		if (found && nums[i] === 7) {
			found = false;
		}
	}

	return sum;
};

console.log(sum67([1, 2, 2]));
console.log(sum67([1, 2, 2, 6, 99, 99, 7]));
console.log(sum67([1, 1, 6, 7, 2]));
