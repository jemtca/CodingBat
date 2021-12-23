
// return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array
// the order of the non-zero numbers does not matter
// so {1, 0, 0, 1} becomes {0 ,0, 1, 1}
// you may modify and return the given array or make a new array
const zeroFront = (nums) => {
	const zeros = [];
	const nonZeros = [];

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] === 0) {
			zeros.push(0);
		} else {
			nonZeros.push(nums[i]);
		}
	}

	return zeros.concat(nonZeros);
};

console.log(zeroFront([1, 0, 0, 1]));
console.log(zeroFront([0, 1, 1, 0, 1]));
console.log(zeroFront([1, 0]));
