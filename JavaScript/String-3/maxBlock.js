
// given a string, return the length of the largest 'block' in the string
// a block is a run of adjacent chars that are the same
const maxBlock = (str) => {
	let largestBlock = 0;
	let lb = 1;

	for (let i = 0; i < str.length; i++) {
		if (i < str.length - 1 && str[i] === str[i + 1]) {
			lb++;
		} else {
			lb = 1;
		}

		if (lb > largestBlock) {
			largestBlock = lb;
		}
	}

	return largestBlock;
};

console.log(maxBlock('hoopla'));
console.log(maxBlock('abbCCCddBBBxx'));
console.log(maxBlock(''));
