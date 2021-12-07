
// return true if the group of N numbers at the start and end of the array are the same
// for example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3
// you may assume that n is in the range 0..nums.length inclusive
const sameEnds = (nums, len) => {
	const strArray = nums.join('');

	if (strArray.substring(0, len) === strArray.substring(strArray.length - len)) {
		return true;
	}

	return false;
};

console.log(sameEnds([5, 6, 45, 99, 13, 5, 6], 1));
console.log(sameEnds([5, 6, 45, 99, 13, 5, 6], 2));
console.log(sameEnds([5, 6, 45, 99, 13, 5, 6], 3));
