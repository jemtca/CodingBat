
// given a string, return the longest substring that appears at both the beginning and end of the string without overlapping
// for example, sameEnds('abXab') is 'ab'
const sameEnds = (str) => {
	let longStr = '';

	for (let i = 0; i < Math.floor(str.length / 2); i++) {
		if (str.substring(0, i + 1) === str.substring(str.length - (i + 1))) {
			longStr = str.substring(0, i + 1);
		}
	}

	return longStr;
};

console.log(sameEnds('abXYab'));
console.log(sameEnds('xx'));
console.log(sameEnds('xxx'));
