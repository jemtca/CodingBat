
// return the number of times that the string 'hi' appears anywhere in the given string
const countHi = (str) => {
	let count = 0;

	for (let i = 0; i < str.length - 1; i++) {
		if (str.substring(i, i + 2) === 'hi') {
			count++;
		}
	}

	return count;
};

console.log(countHi('abc hi ho'));
console.log(countHi('ABChi hi'));
console.log(countHi('hihi'));
