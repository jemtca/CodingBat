
// given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1
// the given n may be 0, in which case just return a length 0 array
// you do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works
const fizzArray = (n) => {
	const result = [];

	for (let i = 0; i < n; i++) {
		result.push(i);
	}

	return result;
};

console.log(fizzArray(4));
console.log(fizzArray(1));
console.log(fizzArray(10));
