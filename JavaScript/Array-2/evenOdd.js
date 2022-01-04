
// return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers
// other than that, the numbers can be in any order
// you may modify and return the given array, or make a new array
const evenOdd = (nums) => {
	const newArray = [];

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] % 2 === 0) {
			newArray.push(nums[i]);
		}
	}

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] % 2 !== 0) {
			newArray.push(nums[i]);
		}
	}

	return newArray;
};

console.log(evenOdd([1, 0, 1, 0, 0, 1, 1]));
console.log(evenOdd([3, 3, 2]));
console.log(evenOdd([2, 2, 2]));
