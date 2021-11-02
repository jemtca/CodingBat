
// return the number of even ints in the given array
const countEvens = (nums) => {
	let evenNumbers = 0;

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] % 2 === 0) {
			evenNumbers++;
		}
	}

	return evenNumbers;
};

console.log(countEvens([2, 1, 2, 3, 4]));
console.log(countEvens([2, 2, 0]));
console.log(countEvens([1, 3, 5]));
