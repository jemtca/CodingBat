
// given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side
const canBalance = (nums) => {
	let sum1 = 0;
	let sum2 = 0;

	for (let i = 0; i < nums.length; i++) {
		sum1 = sum1 + nums[i];

		for (let j = i + 1; j < nums.length; j++) {
			sum2 = sum2 + nums[j];
		}

		if (sum1 === sum2) {
			return true;
		}

		sum2 = 0;
	}

	return false;
};

console.log(canBalance([1, 1, 1, 2, 1]));
console.log(canBalance([2, 1, 1, 2, 1]));
console.log(canBalance([10, 10]));
