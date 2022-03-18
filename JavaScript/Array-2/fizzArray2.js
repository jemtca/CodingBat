
// given a number n, create and return a new string array of length n, containing the strings '0', '1' '2' .. through n-1. N may be 0, in which case just return a length 0 array
const fizzArray2 = (n) => {
	const result  = [];

	for (let i = 0; i < n; i++) {
		result.push(String(i));
	}

	return result;
};

console.log(fizzArray2(4));
console.log(fizzArray2(10));
console.log(fizzArray2(2));
