
// given a string
// return true if the number of appearances of 'is' anywhere in the string is equal to the number of appearances of 'not' anywhere in the string
const equalIsNot = (str) => {
	const re1 = RegExp('is', 'ig');
	const re2 = RegExp('not', 'ig');

	return str.match(re1).length === str.match(re2).length;
};

console.log(equalIsNot('This is not'));
console.log(equalIsNot('This is notnot'));
console.log(equalIsNot('noisxxnotyynotxisi'));
