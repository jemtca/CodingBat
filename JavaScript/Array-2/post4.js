
// given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array
// the original array will contain at least one 4
const post4 = (nums) => {
	const newArray = [];
	const index = nums.lastIndexOf(4) + 1;

	for (let i = index; i < nums.length; i++) {
		newArray.push(nums[i]);
	}
	
	return newArray;
};

console.log(post4([2, 4, 1, 2]));
console.log(post4([4, 1, 4, 2]));
console.log(post4([4, 4, 1, 2, 3]));
