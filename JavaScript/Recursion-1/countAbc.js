
// count recursively the total number of 'abc' and 'aba' substrings that appear in the given string
const countAbc = (str) => {
	if (!str) {
		return 0;
	}

	return (str.length > 2) && (str.substring(0, 3).toLowerCase() === 'abc' || str.substring(0, 3).toLowerCase() === 'aba')
	? 1 + countAbc(str.substring(2)) : countAbc(str.substring(1));
};

console.log(countAbc('abc'));
console.log(countAbc('abcxxabc'));
console.log(countAbc('abaxxaba'));
